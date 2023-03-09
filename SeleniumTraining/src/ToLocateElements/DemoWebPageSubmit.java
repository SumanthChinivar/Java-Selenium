package ToLocateElements;

import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebPageSubmit {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElementById("Email").sendKeys("sumanthchinivar16@gmail.com");
		driver.findElementById("Password").sendKeys("Rowdy@123");
		driver.findElementByXPath("//form/div/input[@type='submit']").click();
		driver.findElementByXPath("//a[@href='/logout']").click();
	}
}
