package RemoteWebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ManageAndGetSize {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println(driver.manage().window().getSize().getHeight());;
		System.out.println(driver.manage().window().getSize().getWidth());
	}
}
