package ToLocateElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCssValue {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		/*
		 * driver.get("https://demo.actitime.com/login.do"); WebElement
		 * login=driver.findElement(By.id("loginButton"));
		 * System.out.println(login.getCssValue("font-family"));
		 * System.out.println(login.getCssValue("border-radius"));
		 * System.out.println(login.getCssValue("color"));
		 */
		
		driver.get("https://demo.actitime.com/login.do");
		driver.findElementById("loginButton").click();
		Thread.sleep(3000);
		WebElement msg=driver.findElementByXPath("//span[contains(text(),'Username')]");
		System.out.println(msg.getCssValue("color"));
		
		
	}
}
