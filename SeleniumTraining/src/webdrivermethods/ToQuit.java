package webdrivermethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToQuit {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.partsbaba.com/");
		String url=driver.getCurrentUrl();
		System.out.println(url);
		driver.quit();
	}
}
