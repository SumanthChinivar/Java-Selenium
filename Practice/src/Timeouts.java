import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Timeouts {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.instagram.com/");
		
		driver.findElement(By.name("username")).sendKeys("sumanthchinivar");
		driver.findElement(By.name("password")).sendKeys("Rowdy@123");
		WebDriverWait password=new WebDriverWait(driver, 15);
		password.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Log in']")));
		driver.findElement(By.xpath("//div[text()='Log in']")).click();	
		
		password.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[contains(text(),'Sorry, your password was incorrect.')]")));
		System.out.println(driver.findElement(By.xpath("//p[contains(text(),'Sorry, your password was incorrect.')]")).getText());
	}
}
