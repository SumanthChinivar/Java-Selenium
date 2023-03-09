package LECB;

import org.openqa.selenium.chrome.ChromeDriver;

public class URL {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.netflix.com/in/");
		System.out.println(driver.getCurrentUrl());
		driver.quit();
	}
}
