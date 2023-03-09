package laptops;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class HP {

	@Test
	public void startHP()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hp.com/in-en/home.html");
		Reporter.log("Running HP",true);
		driver.close();
	}
}
