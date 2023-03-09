import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot3 {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.cornerhouseicecreams.com");
		Thread.sleep(3000);
		WebElement cornerhouse=driver.findElement(By.xpath("//img[@class='Header-branding-logo']"));
		File ss=cornerhouse.getScreenshotAs(OutputType.FILE);
		File f=new File("./errorShots/cornerhouselogo.jpeg");
		FileHandler.copy(ss, f);
	}
}
