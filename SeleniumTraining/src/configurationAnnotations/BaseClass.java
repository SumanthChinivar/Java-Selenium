package configurationAnnotations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

public class BaseClass {

	public WebDriver driver;
	@BeforeClass
	public void BrowserLaunch()
	{
		Reporter.log("Launching the browser");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		Reporter.log("Browser is launched");
		driver.manage().window().maximize();
		Reporter.log("Browser is maximized");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	
	@BeforeMethod
	public void login()
	{
		Reporter.log("User is trying to enter the url");
		driver.get("https://demowebshop.tricentis.com/");
		Reporter.log(driver.getTitle()+" page is opened");
		WebElement login = driver.findElement(By.partialLinkText("Log in"));
		login.click();
		Reporter.log(driver.getTitle()+" is diaplayed");
		WebElement emailTextField = driver.findElement(By.id("Email"));
		emailTextField.sendKeys("sumanthchinivar16@gmail.com");
		WebElement password = driver.findElement(By.id("Password"));
		password.sendKeys("Rowdy@123");
		WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log in']"));
		loginButton.click();
		Reporter.log("User is logged in");
	}
	
	@AfterMethod
	public void logout()
	{
		driver.findElement(By.partialLinkText("Log out")).click();
	}
	
	@AfterClass
	public void CloseBrowser()
	{
		driver.quit();
	}
	
}
