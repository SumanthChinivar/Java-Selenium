package TestCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dream11 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.dream11.com/");
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.name("regEmail")).sendKeys("9449283836");
		driver.findElement(By.id("regUser")).click();
		
		driver.switchTo().parentFrame();
		driver.findElement(By.linkText("About Us")).click();
	}
	
}
