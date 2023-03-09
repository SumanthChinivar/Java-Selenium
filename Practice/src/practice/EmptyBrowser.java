package practice;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class EmptyBrowser {
	public static void main(String[] args) throws MalformedURLException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https:\\google.com");
		driver.manage().window().maximize();
		System.out.println(driver.getPageSource());
		System.out.println(driver.getWindowHandle());
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		Set<String> window=driver.getWindowHandles();
		System.out.println(window);
		driver.navigate().to("https://naukri.com");
		driver.navigate().to(new URL("https://linkedin.com"));
		driver.navigate().refresh();
		
	}
}
