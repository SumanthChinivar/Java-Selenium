package ToLocateElements;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonCart {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Woodland men's shoe");
		driver.findElement(By.id("nav-search-submit-button")).click();
		String parentWindow=driver.getWindowHandle();
		driver.findElementByXPath("//img[contains(@alt,'Woodland Mens G 40777')]").click();
		Set<String> allWindow=driver.getWindowHandles();
		allWindow.remove(parentWindow);
		for(String id:allWindow)
		{
			driver.switchTo().window(id);
			break;
		}
		String price=driver.findElementByXPath("//div[@id='corePrice_desktop\']").getText();
		System.out.println(price);
		String amount1="";
		for(int i=0;i<price.length();i++)
		{
			if(price.charAt(i)>=48 && price.charAt(i)<=57)
			{
				amount1=amount1+price.charAt(i);
			}
		}
		Thread.sleep(2000);
		driver.findElementByXPath("//select[contains(@name,'dropdown_selected_size_name')]").click();
		Thread.sleep(3000);
		driver.findElementByXPath("(//select/option[5])[@id]").click();
		int amount2=Integer.parseInt(amount1);
		Thread.sleep(2000);
		if(amount2<3000) {
			driver.findElementByXPath("//input[contains(@id,'add-to-cart-button')]").click();
		}
		
	}
}
