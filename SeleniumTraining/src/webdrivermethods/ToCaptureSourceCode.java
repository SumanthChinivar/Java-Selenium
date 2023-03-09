package webdrivermethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureSourceCode {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://drive.google.com");
		
		String pageSource=driver.getPageSource();
		System.out.println(pageSource);
		
		driver.quit();
	}
}
	