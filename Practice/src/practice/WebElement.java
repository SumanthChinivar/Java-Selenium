package practice;

import java.awt.Rectangle;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/register");
		driver.manage().window().maximize();
		driver.findElement(By.id("FirstName")).sendKeys("Sumanth");
		driver.findElement(By.id("LastName")).sendKeys("Sumanth");
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("Email")).sendKeys("sumanthchinivar16@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Rowdy@123");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Rowdy@123");
		driver.findElement(By.id("register-button")).submit();
		System.out.println(driver.findElement(By.xpath("//li[contains(text(),'already')]")).getText());
		
		org.openqa.selenium.WebElement email = driver.findElement(By.id("Email"));
		org.openqa.selenium.WebElement password=driver.findElement(By.id("Password"));	
		
		org.openqa.selenium.Rectangle erect=email.getRect();
		org.openqa.selenium.Rectangle pass=password.getRect();
		if(erect.getX()==pass.getX())
		{
			System.out.println("Is alligned properly to left");
		}
		else
			System.out.println("is not alligned");
		if(erect.getX()+erect.getWidth()==pass.getX()+erect.getWidth())
		{
			System.out.println("Is alligned to right");
		}
		else
			System.out.println("is not alligned to right");
		if(erect.getY()+erect.getHeight()+3<=pass.getY())
		   {
			   System.out.println("is alligned");
		   }
		   else
			   System.out.println("is not alligned");
	}
}
