package ToLocateElements;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLocateElementsUsingDirectLocators {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("trainee");
		driver.findElement(By.name("pwd")).sendKeys("trainee");
		driver.findElement(By.id("loginButton")).click();
	}
}
