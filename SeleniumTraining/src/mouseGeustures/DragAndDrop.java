package mouseGeustures;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.get("https://trello.com/");
		
		driver.findElement(By.xpath("(//a[contains(text(),'Log in')])[1]")).click();
		driver.findElement(By.id("user")).sendKeys("sumanthchinivar@hotmail.com",Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.id("password")).sendKeys("Sumi07.@",Keys.ENTER);
		driver.findElement(By.xpath("(//div[@class='board-tile-details is-badged'])[1]")).click();
		
		WebElement src=driver.findElement(By.xpath("//span[text()='Conduct the mock']"));
		WebElement tar=driver.findElement(By.xpath("//textarea[text()='Doing']//..//..//span[text()='Add a card']"));
		
		Actions action=new Actions(driver);
		action.dragAndDrop(src,tar).perform();
		
		WebElement src1=driver.findElement(By.xpath("//span[text()='Complete actions class in selenium']"));
		
		Actions action1=new Actions(driver);
		action.dragAndDropBy(src1,250,0).perform();
		
		WebElement src2=driver.findElement(By.xpath("//span[text()='Match is on day 2']"));
		WebElement tar2=driver.findElement(By.xpath("//textarea[text()='Doing']//..//..//span[text()='Add a card']"));
		
		
		action.moveToElement(src2).clickAndHold().release(tar2).perform();
		
		
	}
}
