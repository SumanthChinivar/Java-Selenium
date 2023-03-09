package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot2 {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://polarbear.co.in/");
		Thread.sleep(2000);
		WebElement polarbearlogo = driver.findElement(By.xpath("//img[@class=' svg-logo']"));
		File screenShot = polarbearlogo.getScreenshotAs(OutputType.FILE);
		File f = new File("./errorshots/image.jpeg");
		FileHandler.copy(screenShot, f);
	}
}
