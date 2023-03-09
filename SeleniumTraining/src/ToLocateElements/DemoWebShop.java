package ToLocateElements;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShop {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	     ChromeDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     
	     driver.get("https://demowebshop.tricentis.com/");
	     driver.findElement(By.className("ico-register")).click();
	     driver.findElement(By.id("gender-male")).click();
	     driver.findElement(By.id("FirstName")).sendKeys("Sumanth");
	     driver.findElement(By.id("LastName")).sendKeys("Chinivar");
	     driver.findElement(By.id("Email")).sendKeys("sumanthchinivar16@gmail.com");
	     driver.findElement(By.id("Password")).sendKeys("Rowdy@123");
	     driver.findElement(By.id("ConfirmPassword")).sendKeys("Rowdy@123");
	     driver.findElement(By.id("register-button")).click();
	     
	}
}
