package laptops;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Lenovo {

	@Test
	public void startLenovo()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.lenovo.com/in/en/");
		Reporter.log("Running Lenovo",true);
		driver.close();
	}
}
