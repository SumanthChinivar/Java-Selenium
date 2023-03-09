package RemoteWebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class ManageWindow {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://google.com");
		System.out.println(driver.getCurrentUrl());
		System.out.println("====================");
		
	}
}
