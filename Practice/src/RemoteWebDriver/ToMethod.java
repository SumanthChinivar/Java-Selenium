package RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToMethod {
	public static void main(String[] args) throws MalformedURLException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to(new URL("https://google.com"));
		
	}
}
