package ToLocateElements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TOclearDataFromInstagram {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElementByXPath("//a[contains(@href,'/login')]").click();
		Thread.sleep(2000);
		WebElement element=driver.findElement(By.xpath("//input[contains(@id,'Email')]"));
		element.sendKeys("Sumanth");
		Thread.sleep(3000);
		element.sendKeys(Keys.CONTROL+"a");
		element.sendKeys(Keys.CONTROL+"c");
		element.clear();
		element.sendKeys(Keys.CONTROL+"v");
		element.sendKeys(Keys.DELETE);
	}
}
