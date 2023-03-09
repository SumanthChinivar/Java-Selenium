package unitTestingTool;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DemoWebShopSystemTesting {
 
	@DataProvider
	public String[][] data() throws EncryptedDocumentException, IOException
	{
		File file=new File("C:\\Users\\vms16\\eclipse-workspace\\SeleniumTraining\\testData\\SystemTesting.xlsx");
		FileInputStream fis=new FileInputStream(file);
		Workbook workbook = WorkbookFactory.create(fis);
		
		Sheet webShopSheet = workbook.getSheet("Sheet1");
		int rowNum=webShopSheet.getPhysicalNumberOfRows();
		int colNum=webShopSheet.getRow(0).getPhysicalNumberOfCells();
		
		String[][] data=new String[rowNum-1][colNum];
		
		for(int i=0;i<rowNum-1;i++) {
			for(int j=0;j<colNum;j++) {
				data[i][j]=webShopSheet.getRow(i+1).getCell(j).toString();
			}
		}
		return data;
	}
	
	@Test(dataProvider ="data")
	public void systemTesting(String[] cred) throws InterruptedException
	{
		//Launching browser
		System.setProperty(cred[0],cred[1]);
		WebDriver driver=new ChromeDriver();
		Reporter.log("Browser is launched",true);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		WebDriverWait explicit=new WebDriverWait(driver, 5);
		driver.manage().window().maximize();
		Reporter.log("Window is maximized",true);
		
		//Opening the web page
		SoftAssert softAssert=new SoftAssert();
		driver.get(cred[2]);
		softAssert.assertEquals(driver.getCurrentUrl(), cred[2], "Welcome page is not displayed");
		Reporter.log("Welcome page is displayed",true);
		
		//Opening the login page
		WebElement login = driver.findElement(By.linkText("Log in"));
		login.click();
		softAssert.assertEquals(driver.getCurrentUrl(),cred[3] ,"Login page was not opened");
		Reporter.log("Login page was opened",true);
		
		//logging in to web page and open home page
		WebElement email = driver.findElement(By.id("Email"));
		email.sendKeys(cred[4]);
		softAssert.assertEquals(email.getAttribute("value"), cred[4], "Email was not entered");
		WebElement password = driver.findElement(By.id("Password"));
		password.sendKeys(cred[5]);
		softAssert.assertEquals(password.getAttribute("value"), cred[4], "Password was not entered");
		WebElement loginbutton = driver.findElement(By.xpath("//input[@value='Log in']"));
		loginbutton.click();
		WebElement homepage = driver.findElement(By.xpath("//a[text()='sumanthchinivar16@gmail.com']"));
		softAssert.assertEquals(homepage.getText(), cred[4],"Homepage is not launched");
		Reporter.log("Home page is opened",true);
		
		WebElement books = driver.findElement(By.xpath("(//a[contains(text(),'Books')])[1]"));
		books.click();
		softAssert.assertEquals(driver.getCurrentUrl(), cred[5],"Books was not displayed");
		Reporter.log("Books page was displayed",true);
	
		//select a book and add to cart
		WebElement addToCart = driver.findElement(By.xpath("//div[@class='product-grid']/div[1]/div/div[2]/div[3]/div[2]/input"));
		addToCart.click();	
		
		//place an order
		WebElement cart = driver.findElement(By.xpath("//span[text()='Shopping cart']"));
		cart.click();
		softAssert.assertEquals(driver.getTitle(),cred[6] , "Cart was not opened");
		Reporter.log("Cart  was displayed",true);
		
		WebElement terms = driver.findElement(By.xpath("//input[@id='termsofservice']"));
		terms.click();
		if(!(terms.isSelected())) {
			driver.navigate().refresh();
			terms.click();
		}
		
		
		WebElement checkout = driver.findElement(By.id("checkout"));
		checkout.click();
		softAssert.assertEquals(driver.getCurrentUrl(), cred[7],"Check Out page was not displayed");
		Reporter.log("Checkout page was displayed",true);
		
		WebElement billingAddress = driver.findElement(By.xpath("(//input[@title='Continue'])[1]"));
		billingAddress.click();
		
		WebElement shippingAddress = driver.findElement(By.xpath("(//input[@title='Continue'])[2]"));
		shippingAddress.click();
		
		WebElement shippingMethod = driver.findElement(By.xpath("(//input[@onclick='ShippingMethod.save()'])"));
		shippingMethod.click();
		
		WebElement paymentMethod = driver.findElement(By.xpath("(//input[@name='paymentmethod'])[1]"));
		paymentMethod.click();
		WebElement continueToInfo = driver.findElement(By.xpath("//input[@onclick='PaymentMethod.save()']"));
		continueToInfo.click();
		
		WebElement paymentInfo = driver.findElement(By.xpath("//input[@onclick='PaymentInfo.save()']"));
		paymentInfo.click();
		
		WebElement confirmOrder = driver.findElement(By.xpath("//input[@onclick='ConfirmOrder.save()']"));
		confirmOrder.click();
		
		WebElement orderConfirmed=driver.findElement(By.xpath("//div[@class='page checkout-page']"));
		WebElement orderConfirmedText = driver.findElement(By.xpath("//strong[text()='Your order has been successfully processed!']"));
		softAssert.assertEquals(orderConfirmedText.getText(), cred[9],"Order not placed");
		Reporter.log("Order confirmed",true);
		driver.quit();
	}
}
