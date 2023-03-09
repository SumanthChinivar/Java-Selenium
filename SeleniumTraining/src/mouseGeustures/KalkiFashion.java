package mouseGeustures;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KalkiFashion {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.kalkifashion.com/");
		
		Actions action=new Actions(driver);
		WebElement ele=driver.findElement(By.xpath("( //a[text()='Collection'])[2]"));
		action.moveToElement(ele).perform();
		
		driver.findElement(By.xpath("( //a[text()='Brother of Bride/ Groom'])[2]")).click();
	}
}
