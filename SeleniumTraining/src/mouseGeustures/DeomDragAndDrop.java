package mouseGeustures;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DeomDragAndDrop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			driver.get("https://www.globalsqa.com/demo-site/draganddrop/#Photo%20Manager");
			Actions action=new Actions(driver);
			driver.switchTo().frame(driver.findElement(By.xpath("//div[@rel-title='Photo Manager']//iframe")));
			
			WebElement src=driver.findElement(By.xpath("//ul[@id='gallery']/li"));
			WebElement tar=driver.findElement(By.id("trash"));
			
			
			action.dragAndDrop(src, tar).build().perform();
			
			Thread.sleep(3000);
			WebElement src1=driver.findElement(By.xpath("(//ul[@id='gallery']/li)[1]"));
			action.dragAndDrop(src1, tar).build().perform();
		
			Thread.sleep(3000);
			WebElement src2=driver.findElement(By.xpath("(//ul[@id='gallery']/li)[1]"));
			action.dragAndDrop(src2, tar).build().perform();
			
			Thread.sleep(3000);
			WebElement src3=driver.findElement(By.xpath("(//ul[@id='gallery']/li)[1]"));
			action.dragAndDrop(src3, tar).build().perform();
			
			WebElement src4 = driver.findElement(By.xpath("//div[@id='trash']/ul/li[1]"));
			WebElement tar1 = driver.findElement(By.xpath("//ul[@id='gallery']"));
			action.dragAndDrop(src4, tar1).build().perform();
			
			Thread.sleep(3000);
			WebElement src5=driver.findElement(By.xpath("//div[@id='trash']/ul/li[1]"));
			action.dragAndDrop(src5, tar1).build().perform();
		
			Thread.sleep(3000);
			WebElement src6=driver.findElement(By.xpath("//div[@id='trash']/ul/li[1]"));
			action.dragAndDrop(src6, tar1).build().perform();
			
			Thread.sleep(3000);
			WebElement src7=driver.findElement(By.xpath("//div[@id='trash']/ul/li[1]"));
			action.dragAndDrop(src7, tar1).build().perform();
			
			driver.switchTo().parentFrame();
			
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//li[text()='Accepted Elements']")).click();
			Thread.sleep(3000);
			driver.switchTo().frame(driver.findElement(By.xpath("//div[@rel-title='Accepted Elements']//iframe")));
			
			Thread.sleep(3000);
			WebElement draggable = driver.findElement(By.id("draggable"));
			WebElement droppable = driver.findElement(By.id("droppable"));
			action.dragAndDrop(draggable,droppable).build().perform();
			
			driver.switchTo().parentFrame();
			driver.findElement(By.xpath("//li[@id='Propagation']")).click();
			driver.switchTo().frame(driver.findElement(By.xpath("//div[@rel-title='Propagation']//iframe")));
			
			Thread.sleep(3000);
			WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
			WebElement indrop = driver.findElement(By.xpath("(//div[@id='droppable-inner'])"));
			action.dragAndDrop(drag, indrop).build().perform();
			}
}
