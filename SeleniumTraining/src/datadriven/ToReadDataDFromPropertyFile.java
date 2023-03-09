package datadriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToReadDataDFromPropertyFile {
	
	public static void main(String[] args) throws IOException {
		//creationOfFile
		FileInputStream fis=new FileInputStream("./testData/testData.properties");
		
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
		System.out.println(prop.get("username"));
		System.out.println(prop.get("password"));
		driver.findElement(By.xpath("//button[contains(text(),'Accept')]")).click();
		driver.navigate().to("https://www.bajajauto.com/bikes");
	}
}
