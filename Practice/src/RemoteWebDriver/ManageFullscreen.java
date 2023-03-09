package RemoteWebDriver;

import org.openqa.selenium.edge.EdgeDriver;

public class ManageFullscreen {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "./driver/msedgedriver.exe");
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().fullscreen();
		
		driver.get("https://google.com");
		Thread.sleep(2000);
		driver.quit();
	}
}
