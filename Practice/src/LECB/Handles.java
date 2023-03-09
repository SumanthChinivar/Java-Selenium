package LECB;

import org.openqa.selenium.chrome.ChromeDriver;

public class Handles {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.primevideo.com/");
		System.out.println(driver.getPageSource());
		driver.quit();
	}
}
