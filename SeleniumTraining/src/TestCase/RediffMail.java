package TestCase;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class RediffMail {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.id("login1")).sendKeys("sumanthelfbatch@rediffmail.com");
		driver.findElement(By.id("password")).sendKeys("Testing@123");
		driver.findElement(By.name("proceed")).click();
		driver.findElement(By.linkText("Write mail")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter name or email' and @id='TO_IDcmp2']")).sendKeys("sumanthelfbatch@rediffmail.com",Keys.ENTER);
		driver.findElement(By.xpath("//input[@class='rd_inp_sub rd_subject_datacmp2']")).sendKeys("sumanth");
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@title,'Rich Text Editor')]")));
		driver.findElement(By.tagName("body")).sendKeys("Welcome to advanced automation");
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Send")).click();
	
		for(;;)
		{
			try
			{
				driver.findElement(By.xpath("//span[@title='sumanth']/..//cite[@title='Select mail']")).click();
				break;
			}
			catch(NoSuchElementException e)
			{
				driver.findElement(By.xpath("//cite[@title='Refresh Inbox']")).click();
			}
		}
		
		driver.findElement(By.xpath("//span[text()='Delete']")).click();
		driver.findElement(By.xpath("//button[text()='Ok']")).click();
		System.out.println(driver.findElement(By.id("rdNotify")).getText());
		Thread.sleep(3000);
		WebElement cornerhouse=driver.findElement(By.xpath("//div[@id='rdNotify']"));
		File ss=cornerhouse.getScreenshotAs(OutputType.FILE);
		File f=new File("./errorShots/rediff.jpeg");
		FileHandler.copy(ss, f);
	}
}