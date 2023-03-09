package webdrivermethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToExploreWindowMethods {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.skillrary.com/");
		Thread.sleep(1000);
		Dimension beforeMaximize=driver.manage().window().getSize();
		System.out.println(beforeMaximize.getHeight());
		System.out.println(beforeMaximize.getWidth());
		
		System.out.println("==================================");
		
		driver.manage().window().fullscreen();
		Dimension afterMaximize=driver.manage().window().getSize();
		System.out.println(beforeMaximize.getHeight());
		System.out.println(beforeMaximize.getWidth());
	}
}
