package Popup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUpload {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Actions action=new Actions(driver);
	
	driver.get("https://www.naukri.com/");
	driver.findElement(By.id("register_Layer")).click();
	Thread.sleep(3000);
	action.sendKeys(Keys.PAGE_DOWN).perform();
	driver.findElement(By.xpath("//input[@id='resumeUpload']")).sendKeys("C:\\Users\\vms16\\OneDrive\\Documents\\Sumanthresume.docx");
}
}
