package Popup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ShopperStack {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.get("https://www.shoppersstack.com/");
		Actions action=new Actions(driver);
		for(;;)
		{
			try
			{
				action.sendKeys(Keys.PAGE_DOWN).perform();
				
			}
			catch(Exception e)
			{
				Thread.sleep(1000);
			}
			if(driver.findElement(By.xpath("//a[text()='Swagger documentation']")).isDisplayed())
			{
				break;
			}
			
		}
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Swagger documentation']")).click();
		
		Thread.sleep(3000);
		
		Alert popup = driver.switchTo().alert();
		System.out.println(popup.getText());
		popup.accept();
		
		popup.sendKeys("admin");
		
		popup.sendKeys("admin");
		popup.accept();
		
		
		if(popup.getText().equals("Invalid Password"))
		{
			System.out.println("Enter correct password");
		}
		else
		{
			System.out.println("TestCase Passed");
		}
		popup.accept();
	}
}
