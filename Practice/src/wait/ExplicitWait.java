package wait;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://pizzaonline.dominos.co.in/");
		Thread.sleep(2000);
		WebDriverWait explicit=new WebDriverWait(driver,15);
		explicit.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//button[text()='Allow']"))));
		driver.findElement(By.xpath("//button[text()='Allow']")).click();
	}
}
