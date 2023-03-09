package mouseGeustures;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SkillRaryDoubleClick {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.get("https://demoapp.skillrary.com/product.php?product=selenium-training");
		
		Actions action=new Actions(driver);
		Thread.sleep(5000);
		WebElement ele=driver.findElement(By.id("add"));
		action.doubleClick(ele).perform();
	}
}
