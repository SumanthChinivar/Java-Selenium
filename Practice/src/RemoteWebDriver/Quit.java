package RemoteWebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Quit {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://amazon.com");
		driver.close();
	}
}