package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot1 {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://pizzaonline.dominos.co.in/");
		Thread.sleep(2000);
		TakesScreenshot ts=(TakesScreenshot)driver;
		File screenShot = ts.getScreenshotAs(OutputType.FILE);
		File f=new File("./errorshots/image1.jpeg");
		FileHandler.copy(screenShot, f);
	}
}
