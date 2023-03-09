package Popup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUp {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://licindia.in/");
		try
		{
			driver.findElement(By.linkText("Agents Portal")).click();
		}
		catch(Exception e)
		{
			Thread.sleep(1000);
			driver.findElement(By.linkText("Agents Portal")).click();
		}
		Alert confirmationPopup=driver.switchTo().alert();
		System.out.println(confirmationPopup.getText());
		Thread.sleep(1000);
		confirmationPopup.accept();
	}
}
