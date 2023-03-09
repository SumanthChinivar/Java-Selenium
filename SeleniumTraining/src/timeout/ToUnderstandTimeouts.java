package timeout;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToUnderstandTimeouts {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.shoppersstack.com/products_page/6");
		
		driver.findElement(By.xpath("//input[@placeholder='580023']")).sendKeys("560010");
		WebDriverWait explicit=new WebDriverWait(driver, 15);
		explicit.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Check']")));
		
		driver.findElement(By.xpath("//button[text()='Check']")).click();
		
	}
}
