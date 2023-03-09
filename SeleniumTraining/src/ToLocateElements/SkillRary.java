package ToLocateElements;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SkillRary {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.skillrary.com/");
		Thread.sleep(3000);
		driver.findElement(By.linkText("SIGN IN")).click();
		for(;;)
		{
			try
			{
				driver.findElement(By.xpath("//div/p/button[text()='Accept']")).click();
				break;
			}
			catch(Exception e)
			{
				Thread.sleep(1000);
			}
		}
		driver.findElement(By.xpath("//div/button[@type='submit']")).submit();
	}
}
