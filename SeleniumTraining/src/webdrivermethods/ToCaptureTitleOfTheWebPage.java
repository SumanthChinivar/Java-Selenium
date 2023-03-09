package webdrivermethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureTitleOfTheWebPage {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.bestproductsreviews.com/");
		String title=driver.getTitle();
		System.out.println(title);
	}
}
