package LECB;

import org.openqa.selenium.chrome.ChromeDriver;

public class Get {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver drive=new ChromeDriver();
		
		drive.get("https://wikipedia.com");
		Thread.sleep(1000);
		
		drive.quit();
	}

}
