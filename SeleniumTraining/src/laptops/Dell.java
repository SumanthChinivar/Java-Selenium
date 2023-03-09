package laptops;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Dell{

	@Test(groups = "smoke")
	public void startDell()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.dell.com/en-in");
		Reporter.log("Running Dell",true);
		driver.close();
	}
}
