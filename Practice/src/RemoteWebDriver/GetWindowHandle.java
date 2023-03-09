package RemoteWebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class GetWindowHandle {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("https://gmail.com");
		System.out.println(driver.getWindowHandle());
	}
}
