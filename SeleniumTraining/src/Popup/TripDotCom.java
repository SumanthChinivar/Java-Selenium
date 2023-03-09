package Popup;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TripDotCom {
public static void main(String[] args) {
	LocalDateTime ldt=LocalDateTime.now();
	String month=ldt.getMonth().toString();
	month=month.charAt(0)+month.substring(1,3).toLowerCase();
	int date=ldt.getDayOfMonth();
	int year=ldt.getYear();
	
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	
	driver.get("https://www.trip.com/flights");
	driver.findElement(By.xpath("//i[contains(@class,'close-icon')]")).click();
	driver.findElement(By.xpath("//input[@value='Thu, Feb 16']")).click();
	driver.findElement(By.xpath("//h3[text()='Feb 2023']/..//span[text()='14']")).click();
	
	
}
}
