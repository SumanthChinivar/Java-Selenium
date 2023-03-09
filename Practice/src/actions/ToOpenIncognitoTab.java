package actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ToOpenIncognitoTab {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeOptions setting=new ChromeOptions();
	setting.addArguments("--disable");
	WebDriver driver=new ChromeDriver(setting);
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
}
}
