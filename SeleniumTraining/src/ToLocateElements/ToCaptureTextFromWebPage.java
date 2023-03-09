package ToLocateElements;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureTextFromWebPage {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(3000);
		String errorMessage=driver.findElement(By.xpath("//span[@class='errormsg' and contains(text(),'Please try again')]")).getText();
		System.out.println(errorMessage);
	}
}
