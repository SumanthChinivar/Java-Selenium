package mouseGeustures;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SBIYono {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.sbiyono.sbi/wps/portal/login?ERROR_CODE=LOTUS.AUTH.07&sa=U");
		
		Actions action=new Actions(driver);
		driver.findElement(By.id("password")).sendKeys("Jogi@123");
		WebElement ele=driver.findElement(By.tagName("mat-icon"));
		
		action.moveToElement(ele, 0 , 0).click().perform();
	}
}
