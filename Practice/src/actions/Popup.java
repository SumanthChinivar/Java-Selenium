package actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	driver.get("https://licindia.in/");
	
	for(;;)
	{
	try {
		driver.findElement(By.partialLinkText("Agents Portal")).click();
	}
	catch(Exception e)
	{
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		driver.findElement(By.partialLinkText("Agents Portal")).click();
		
	}
	Alert alert=driver.switchTo().alert();
	System.out.println(alert.getText());
	alert.accept();
	driver.close();
	}
}
}
