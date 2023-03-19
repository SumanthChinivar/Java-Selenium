import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;


public class WhatsappWeb {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./driver/msedgedriver");
	EdgeDriver driver=new EdgeDriver();
	driver.get("https://web.whatsapp.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	
	for(int i=1;i<10;i++)
	{
		driver.findElement(By.xpath("//span[@title='Sumanth Chinivar']")).click();
		driver.findElement(By.xpath("//div[@title='Type a message']")).sendKeys("HAI");
		driver.findElement(By.xpath("//span[@data-icon='send']")).click();
	}
}
}
