import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class SVGTag {

	@Test
	public void locateSVGTag() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Reporter.log("Browser is launched",true);
		driver.manage().window().maximize();
		Reporter.log("Browser is maximized",true);
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		driver.get("https://petdiseasealerts.org/forecast-map#/");
		driver.switchTo().frame(driver.findElement(By.xpath("//div[@class='capc-map-embed']/iframe")));
		String name="deLaware";
		name=name.toLowerCase();
		driver.findElement(By.xpath("//*[name()='svg' and @id='map-svg']//*[name()='g' and @id='"+name+"']")).click();
		Thread.sleep(5000);
		driver.quit();
	}
}
