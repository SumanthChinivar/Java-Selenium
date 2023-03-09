package js;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollMethod {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.google.com/doodles");
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		for(;;)
		{
			try {
				driver.findElement(By.partialLinkText("Azerbaijan Independence Day 2022")).click();
				break;
			}
			catch(Exception e)
			{
				jse.executeScript("window.scrollBy(0,100);");
			}
		}
	}
}
