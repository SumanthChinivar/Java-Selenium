package LECB;

import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https:\\spotify.com");
		System.out.println(driver.getWindowHandle());
		Thread.sleep(3000);
		driver.quit();
	}
}
