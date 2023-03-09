package ToLocateElements;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginDemoWebShop {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	     ChromeDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     
	     driver.get("https://demowebshop.tricentis.com/");
	     driver.findElement(By.className("ico-login")).click();
	     driver.findElement(By.id("Email")).sendKeys("sumanthchinivar16@gmail.com");
	     driver.findElement(By.id("Password")).sendKeys("Rowdy@123");
	     driver.findElement(By.cssSelector("input[value='Log in']")).click();
	     driver.findElement(By.linkText("Log out")).click();
	}
}
