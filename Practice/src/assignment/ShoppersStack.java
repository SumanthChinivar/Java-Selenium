package assignment;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ShoppersStack {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.get("https://shoppersstack.com/");
		driver.findElement(By.xpath("//img[@alt='APPLE iPhone 14 Pro']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("fl_compare")).click();
		
		Set<String> set = driver.getWindowHandles();
		for(String s:set)
		{
			driver.switchTo().window(s);
			if(driver.getTitle().contains("ebay.com"))
			{
				Thread.sleep(3000);
				TakesScreenshot ts=(TakesScreenshot)driver;
				File ss=ts.getScreenshotAs(OutputType.FILE); 
				File f=new File("./ErrorShots/Ebay.jpeg");
				FileHandler.copy(ss, f);
			}
		}		
	}
}
