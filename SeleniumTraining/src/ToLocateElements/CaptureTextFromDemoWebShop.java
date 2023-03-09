package ToLocateElements;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureTextFromDemoWebShop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.partialLinkText("Jewelry")).click();
		driver.findElement(By.xpath("//img[@alt='Picture of Black & White Diamond Heart']")).click();
		String description=driver.findElementByXPath("//div[contains(text(),'Heart')]").getText();
		System.out.println(description);
		String availability=driver.findElementByXPath("//span[contains(text(),'Availability')]").getText();
		System.out.print(availability);
		String stock=driver.findElementByXPath("//span[contains(text(),'In stock')]").getText();
		System.out.println(stock);
		String fulldescription=driver.findElementByXPath("//div[contains(@class,'full-description')]").getText();
		System.out.println(fulldescription);
	}
}
