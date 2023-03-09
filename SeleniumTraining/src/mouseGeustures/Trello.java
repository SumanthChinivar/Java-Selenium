package mouseGeustures;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Trello {
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
		Actions action=new Actions(driver);
		action.contextClick(driver.findElement(By.xpath("//span[contains(@class,'list-card-title js-card-name')]"))).perform();
		List<WebElement> elts = driver.findElements(By.xpath("//div[contains(@class,'quick-card-editor-buttons fade-in')]"));
		for(WebElement elt:elts)
		{
			System.out.println(elt.getText());
		}
	}
}
