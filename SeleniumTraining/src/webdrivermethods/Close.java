package webdrivermethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Close {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/vms16/Downloads/MultipleWindow.html");
		
		driver.findElement(By.xpath("//input[@value='Open Food Sites']")).click();
		
		Thread.sleep(4000);
		System.out.println(driver.getTitle());
		Set<String> allWindowIDs =driver.getWindowHandles();
		System.out.println(allWindowIDs.size());
		
		System.out.println(allWindowIDs);
		driver.close();
	}
}
