package LECB;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchEmptyChromeBrowser {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver drive=new ChromeDriver();
		drive.close();
		
		System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
		EdgeDriver drive1=new EdgeDriver();
		drive1.close();
		
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		FirefoxDriver drive2=new FirefoxDriver();
		drive2.close();
	}
}
