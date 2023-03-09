package Popup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prompt {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		driver.switchTo().frame("iframeResult");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Alert promptAlert=driver.switchTo().alert();
		promptAlert.sendKeys("Sumanth");
		System.out.println(promptAlert.getText());
		promptAlert.accept();
		System.out.println(driver.findElement(By.id("demo")).getText());
	}
}
