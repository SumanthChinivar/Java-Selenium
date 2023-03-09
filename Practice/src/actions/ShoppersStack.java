package actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ShoppersStack {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	Actions action=new Actions(driver);
	driver.get("https://www.shoppersstack.com/");
	Thread.sleep(10000);
	for(;;) {
		try
	{
	action.sendKeys(Keys.PAGE_DOWN).perform();		
	}
	catch (Exception e) {
		// TODO: handle exception
		Thread.sleep(1000);
	}
	if(driver.findElement(By.xpath("//a[text()='Swagger documentation']")).isDisplayed())
			{
				break;
			}
}
	driver.findElement(By.xpath("//a[text()='Swagger documentation']")).click();
}
}
