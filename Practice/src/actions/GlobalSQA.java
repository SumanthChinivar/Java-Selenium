package actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GlobalSQA {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.globalsqa.com/demo-site/draganddrop");
		driver.switchTo().frame(driver.findElement(By.xpath("//div[@rel-title='Photo Manager']//iframe")));
		WebElement src = driver.findElement(By.xpath("//ul[@id='gallery']/li"));
		WebElement src1 = driver.findElement(By.xpath("(//ul[@id='gallery']/li)[2]"));
		WebElement trg = driver.findElement(By.id("trash"));
		Actions action=new Actions(driver);
		action.dragAndDrop(src, trg).perform();
		Thread.sleep(3000);
		action.dragAndDrop(src1, trg).perform();
		action.dragAndDrop(driver.findElement(By.xpath("//h5[text()='High Tatras 4']")),trg).perform();
		
		src=driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
		trg=driver.findElement(By.id("gallery"));
		action.dragAndDrop(src, trg).perform();
	}
}
