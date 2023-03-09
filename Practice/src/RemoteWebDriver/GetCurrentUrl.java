package RemoteWebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class GetCurrentUrl {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("https://facebook.com");
		System.out.println(driver.getCurrentUrl());
	}
}
