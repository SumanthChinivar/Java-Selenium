package ToLocateElements;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do");
		String windowHandle=driver.getWindowHandle();
		driver.findElement(By.id("loginButton"));
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		Set<String> allWindowId=driver.getWindowHandles();
		allWindowId.remove(windowHandle);		
		for(String id: allWindowId)
		{
			driver.switchTo().window(id);
		}
		Thread.sleep(6000);
		driver.findElement(By.linkText("Try Free")).click();
		
	}
}
