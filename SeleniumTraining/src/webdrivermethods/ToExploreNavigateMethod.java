package webdrivermethods;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToExploreNavigateMethod {
	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://baskinrobbinsindia.com/");
		Thread.sleep(2000);
		driver.navigate().to("https://polarbear.co.in/");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		driver.navigate().to(new URL("https://baskinrobbinsindia.com/"));
	}
}
