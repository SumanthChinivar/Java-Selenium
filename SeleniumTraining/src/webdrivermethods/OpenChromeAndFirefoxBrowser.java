package webdrivermethods;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenChromeAndFirefoxBrowser {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://zomato.com/");
	
	System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	FirefoxDriver driver1=new FirefoxDriver();
	driver1.get("https://swiggy.com/");
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vms16\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
	ChromeDriver drive=new ChromeDriver();
}
}
