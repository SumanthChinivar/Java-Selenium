package practice;

import org.openqa.selenium.chrome.ChromeDriver;

public class VTiger {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://localhost:8888/");
	driver.manage().window().maximize();
}
}
