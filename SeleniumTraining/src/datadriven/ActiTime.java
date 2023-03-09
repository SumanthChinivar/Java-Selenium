package datadriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("./testData/actiTime.properties");
		
		//Creation Of file type object
		Properties prop=new Properties();
		
		//Read methods
		prop.load(fis);
		String testUrl=(String)prop.get("url");
		
		String driverKey=(String)prop.get("driverKey");
		String driverPath=(String)prop.get("driverPath");
		
		System.setProperty(driverKey,driverPath);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get(testUrl);
		
		String username=(String) prop.get("username1");
		String password=(String) prop.get("password1");
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
		if((driver.findElement(By.xpath("//span[text()='Me']")).getText()).equals("Me"))
		{
			System.out.println("Admin Login");
		}
		else
			System.out.println("User Login");
	}
	
}
