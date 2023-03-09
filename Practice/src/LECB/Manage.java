package LECB;

import org.openqa.selenium.chrome.ChromeDriver;

public class Manage {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://gaana.com/");
		driver.manage().window().fullscreen();
		
		
	}
}
