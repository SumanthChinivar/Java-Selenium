package ToLocateElements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SearchNumberOfProductsUsingGetElements 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.kalkifashion.com/ethnic/men-s-kurta-set.html");
		
		/*
		 * List<WebElement> kalkiproduct=driver.findElementsByXPath(
		 * "//nav[not(@id='mobile-nav')]//div[contains(@id,'desktop-nav')]/div");
		 * System.out.println(kalkiproduct.size());
		 * 
		 * for(WebElement select: kalkiproduct) { System.out.println(select.getText());
		 * }
		 */
		
		List<WebElement> navBarElements = driver.findElements(By.xpath("//div[contains(@class,'products wrapper')]/div/form"));
		System.out.println(navBarElements.size());
		for (WebElement navEle : navBarElements) {
			System.out.println((navEle).getText());
		}
	}
}
