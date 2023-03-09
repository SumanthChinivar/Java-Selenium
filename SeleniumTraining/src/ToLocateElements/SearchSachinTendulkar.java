package ToLocateElements;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchSachinTendulkar {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("Sachin Tendulkar");
		Thread.sleep(2000);
		driver.findElement(By.name("btnK")).click();
	}
}
