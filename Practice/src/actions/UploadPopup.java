package actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadPopup {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
	
	driver.findElement(By.id("resumeUpload")).sendKeys("C:\\Users\\vms16\\OneDrive\\Documents\\Sumanthresume.docx");
	
}
}
