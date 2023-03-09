package ToLocateElements;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class WoodenStreetNavigationBar {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
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
		String productno="5";
		
		driver.findElementByXPath("//nav/ul/li["+ productno+"]/a").click();
		Thread.sleep(5000);
		driver.findElementByXPath("(//div/div[contains(@class,'top-list')])/a[5]").click();
		Thread.sleep(5000);
		driver.findElementByXPath("//div/div/div[contains(@id,'article_26615')]/a").click();
		Thread.sleep(5000);
		String parentWindowId=driver.getWindowHandle();
		Set<String> windowHandles=driver.getWindowHandles();
		windowHandles.remove(parentWindowId);
		for(String id:windowHandles)
		{
			driver.switchTo().window(id);
		}
		String offerPrice=driver.findElementByXPath("//span[contains(@class,'offerprice')]").getText();
		
		String[] prices=offerPrice.split(" ");
		prices[1]=prices[1].replace("Rs", "");
		prices[1]=prices[1].replace(",","");
		int price=Integer.parseInt(prices[1]);
		System.out.println(price);
		if(price<50000)
		{
			driver.findElementByXPath("//a[contains(@class,'Add-Cart ')]").click();
		}
		System.out.println(driver.findElementByXPath("//ul[contains(@class,'detail-prolist')]/li[2]").getText());
		System.out.println(driver.findElementByXPath("//ul[contains(@class,'detail-prolist')]/li[3]").getText());
		System.out.println(driver.findElementByXPath("//ul[contains(@class,'detail-prolist')]/li[4]").getText());
		System.out.println(driver.findElementByXPath("//ul[contains(@class,'detail-prolist')]/li[5]").getText());
		System.out.println(driver.findElementByXPath("//ul[contains(@class,'detail-prolist')]/li[6]").getText());
		System.out.println(driver.findElementByXPath("//ul[contains(@class,'detail-prolist')]/li[7]").getText());
		System.out.println(driver.findElementByXPath("//ul[contains(@class,'detail-prolist')]/li[8]").getText());
		System.out.println(driver.findElementByXPath("//ul[contains(@class,'detail-prolist')]/li[9]").getText());
		//System.out.println(driver.findElementByXPath("").getText());
	
	}
}
