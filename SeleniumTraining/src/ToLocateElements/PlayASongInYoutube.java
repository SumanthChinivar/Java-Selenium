package ToLocateElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PlayASongInYoutube {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://youtube.com");
		Thread.sleep(8000);
		driver.findElementByXPath("//div[contains(@class,'touch-response-inverse')]").click();
		Thread.sleep(3000);
		driver.findElement(By.name("search_query")).click();
		driver.findElementByName("search_query").sendKeys("Gaalipata 2 title track");
		driver.findElementById("search-icon-legacy").click();
		Thread.sleep(3000);
		/*
		 * for(;;) { try {
		 * driver.findElementByXPath("//button[contains(@aria-label,'No thanks')]").
		 * click(); break; } catch(Exception e) { Thread.sleep(1000); } }
		 */
		driver.findElementByXPath("//a[@id='thumbnail' and @href='/watch?v=xfu7LXl2Nas']").click();
	}
}
