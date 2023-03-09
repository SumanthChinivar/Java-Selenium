package RemoteWebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Navigate {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://kalkifashion.com");
		String windowHandle=driver.getWindowHandle();
		System.out.println(driver.getTitle());
		driver.get("https://www.meesho.com/");
		String windowHandle1=driver.getWindowHandle();
		driver.navigate().back();
		System.out.println(driver.getTitle());
		driver.navigate().forward();
		
		System.out.println(driver.getTitle());
		driver.navigate().refresh();
	}
}
