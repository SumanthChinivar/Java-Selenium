package Popup;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleCalendar {
	public static void main(String[] args) {
		LocalDateTime ldt=LocalDateTime.now();
		String month=ldt.getMonth().toString();
		month=month.charAt(0)+month.substring(1,month.length()).toLowerCase();
		int date=ldt.getDayOfMonth();
		int year=ldt.getYear();
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.xpath("//span[contains(@class,'circularclose')]")).click();
		driver.findElement(By.xpath("//label[@for='departure']")).click();
		
		for(;;)
		{
			try
			{
				driver.findElement(By.xpath("//div[contains(text(),'"+month+"')]/../..//p[text()='"+date+"']")).click();
				break;
			}
			catch(NoSuchElementException e)
			{
				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			}
		}
	}
}
