package js;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSEScroll {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.naukri.com/registration/createAccount");
		Thread.sleep(1000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.getElementById('mobile').scrollIntoView(arguments[0]);",true);
		
//		driver.get("https://www.naukri.com/registration/createAccount");
//		Thread.sleep(1000);
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("document.getElementById('mobile').arguments[0]",scrollIntoView(true));--cannot be performed
	}
}
