package pen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Parker{

	@Test(groups="crm")
	public void write() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.parker.com/us/en/home.html");
		Reporter.log("writing in parker pen",true);
		driver.close();
	}
}
