package assignment;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseChildWindows {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.get("https://shoppersstack.com/");
		driver.get("https://shoppersstack.com/");
		driver.findElement(By.xpath("//img[@alt='APPLE iPhone 14 Pro']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("fl_compare")).click();
		String parent=driver.getWindowHandle();
		
		Set<String> set = driver.getWindowHandles();
		Map<String,String> map=new TreeMap();
		for(String s:set)
		{
			driver.switchTo().window(s);
			map.put(driver.getTitle().toLowerCase(), s);
		}
		
		Set<String> allWin = map.keySet();
		for(String key:allWin)
		{
			driver.switchTo().window(map.get(key));
			driver.close();
			Thread.sleep(3000);
		}
	}
}
