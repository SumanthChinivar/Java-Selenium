package ToLocateElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BooleanMethods {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	     ChromeDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://www.instagram.com/");
	     Thread.sleep(3000);
	     WebElement username = driver.findElement(By.xpath("//input[contains(@name,'username')]"));
	     
	     username.sendKeys("Sumanth");
	     WebElement signin=driver.findElement(By.xpath("//button[contains(@type,'submit')]"));
	     System.out.println(signin.isEnabled());
	     System.out.println(signin.isDisplayed());
	     WebElement password=driver.findElement(By.name("password"));
	     password.sendKeys("agileMethod");
	     Thread.sleep(3000);
	     System.out.println(signin.isEnabled());
	    
	}
}
