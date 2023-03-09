package webdrivermethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToNavigateToAnApplication {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.zomato.com/");
	driver.get("https://www.swiggy.com/");
}
}
