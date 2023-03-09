package AutoScript;

import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		driver.findElementByXPath("//input[contains(@id,'username')]").sendKeys("admin");
		driver.findElementByXPath("//input[contains(@type,'password')]").sendKeys("manager");
		driver.findElementByXPath("//a[contains(@id,'loginButton')]").click();
	}
}
