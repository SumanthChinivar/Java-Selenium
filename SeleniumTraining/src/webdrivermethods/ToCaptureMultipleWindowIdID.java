package webdrivermethods;

import java.util.Set;

import org.openqa.selenium.firefox.FirefoxDriver;

public class ToCaptureMultipleWindowIdID {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		FirefoxDriver driver1=new FirefoxDriver();
		
		driver1.get("https://www.partsbaba.com/");
		Set<String> windowIds=driver1.getWindowHandles();
		System.out.println(windowIds);
	}
}
