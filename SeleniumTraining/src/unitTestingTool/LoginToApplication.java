package unitTestingTool;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginToApplication {

	@DataProvider(parallel=true,name="cred")
	public String[][] sendData()
	{
		String[][] sarr= {{"admin","manager"},{"trainee","trainee"},{"sumanth","test@123"}};
		return sarr;
	}
	
	@Test(dataProvider="cred")
	public void login(String[] cred) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys(cred[0]);
		driver.findElement(By.name("pwd")).sendKeys(cred[1]);
		driver.quit();
	}
}
