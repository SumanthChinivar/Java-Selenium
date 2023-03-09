package RemoteWebDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ManageWindowAndSetSize {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.manage().window().setSize(new Dimension(1080, 1080));
		System.out.println(driver.manage().window().getSize());
	}
}
