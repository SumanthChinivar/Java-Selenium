package LECB;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver1=new ChromeDriver();
		
		driver1.get("https://www.kalkifashion.com/");
	}
}
