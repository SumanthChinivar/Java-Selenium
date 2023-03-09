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
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DemoExcel {

	
	@DataProvider(parallel=false,name="data")
	public String[][] data() throws EncryptedDocumentException, IOException
	{
		File file=new File("C:\\Users\\vms16\\eclipse-workspace\\SeleniumTraining\\testData\\DemoWebShop.xlsx");
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
	
	@Test(dataProvider="data")
	public void register(String[] cred)
	{
		String homePageTitle="";
		String registerResultPage="";
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Reporter.log("Browser is launched",true);
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/register");
		
		SoftAssert softAssert = new SoftAssert() ;
		softAssert.assertEquals(driver.getTitle(),homePageTitle,homePageTitle+" was not launched");
		Reporter.log("Register page was launched",true);
		
		WebElement gender = driver.findElement(By.id("gender-"+cred[0].toLowerCase()+""));
		gender.click();
		softAssert.assertEquals(true,gender.isSelected(), "Gender is not selected");
		Reporter.log("gender was selected",true);
		
		WebElement firstName = driver.findElement(By.id("FirstName"));
		firstName.sendKeys(cred[1]);
		softAssert.assertEquals(firstName.getAttribute("value"),cred[1],"First name was not entered");
		Reporter.log("First name was entered",true);
		
		WebElement lastName = driver.findElement(By.id("LastName"));
		lastName.sendKeys(cred[2]);
		softAssert.assertEquals(lastName.getAttribute("value"),cred[2], "Last name was not entered");
		Reporter.log("Second name was entered",true);
		
		WebElement email = driver.findElement(By.id("Email"));
		email.sendKeys(cred[3]);
		softAssert.assertEquals( email.getAttribute("value"),cred[3],"Email was not entered");
		Reporter.log("Email was entered",true);
		
		WebElement password = driver.findElement(By.id("Password"));
		password.sendKeys(cred[4]);
		softAssert.assertEquals(password.getAttribute("value"),cred[4],"Password is not entered");
		Reporter.log("Password was entered",true);
		
		WebElement confirmPassword = driver.findElement(By.id("ConfirmPassword"));
		confirmPassword.sendKeys(cred[5]);
		softAssert.assertEquals(confirmPassword.getAttribute("value"), cred[5],"Password was not confirmed");
		Reporter.log("Password was confirmed",true);
		
		WebElement reg = driver.findElement(By.id("register-button"));
		reg.click();
		softAssert.assertEquals(driver.getTitle(), registerResultPage,"Failed to navigate to result home page");
		Reporter.log("Navigated to result page",true);
		softAssert.assertAll();
		driver.quit();
		}
}
