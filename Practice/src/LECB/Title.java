package LECB;

import org.openqa.selenium.chrome.ChromeDriver;

public class Title {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https:\\google.com");
		System.out.println(driver.getTitle());
	}
}
