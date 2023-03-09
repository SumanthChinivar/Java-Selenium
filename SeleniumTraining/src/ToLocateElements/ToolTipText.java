package ToLocateElements;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTipText {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		/*
		 * driver.get("https://demo.actitime.com/login.do"); 
		 * String value=driver.findElement(By.xpath("//div[contains(@id,'keepMeLoggedInCaptionContainer')]")).getAttribute("title");
		 *  System.out.println(value);
		 */
		
		driver.get("https://www.woodenstreet.com/");
		for(;;)
		{
			try
			{
				driver.findElementByXPath("//div[contains(@id,'loginclose1')]").click();
				break;
			}
			catch(Exception e)
			{
				Thread.sleep(1000);
			}
		}
		String value=driver.findElementByXPath("//img[@title='Office Furniture Online']").getAttribute("alt");
		System.out.println(value);
		
	}
}
