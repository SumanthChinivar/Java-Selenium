package actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	driver.get("https://netbanking.hdfcbank.com/netbanking/");
	driver.switchTo().frame("login_page");
	driver.findElement(By.linkText("CONTINUE")).click();
	Alert popup=driver.switchTo().alert();
	System.out.println(popup.getText());
	popup.accept();
}
}
