package webdrivermethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseParentWindow {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/vms16/Downloads/MultipleWindow.html");
		driver.findElement(By.xpath("//input[@value='Open Food Sites']")).click();
		Thread.sleep(3000);
		/*
		 * Set<String> allWindowId=driver.getWindowHandles();
		 * System.out.println(allWindowId); for(String windowID:allWindowId) {
		 * driver.switchTo().window(windowID);
		 * if(!(driver.getTitle().contains("Multiple popups"))) { driver.close(); } }
		 */
		driver.close();
	}
}


