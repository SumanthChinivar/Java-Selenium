package timeout;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitAndImplicitTimeouts {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.get("https://demowebshop.tricentis.com/login");
		
		driver.findElement(By.id("Email")).sendKeys("sumanthchinivar16@gmail.com");
		WebDriverWait explicit=new WebDriverWait(driver, 15);
		driver.findElement(By.id("Password")).sendKeys("Rowdy@123");
		explicit.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[text()='Log in']")));
		
		driver.findElement(By.xpath("//input[text()='Log in']")).click();
	}
}
