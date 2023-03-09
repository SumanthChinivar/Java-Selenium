package ToLocateElements;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WoodenStreet {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	     ChromeDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     
	     driver.get("https://www.woodenstreet.com");
	     
	     for(;;) 
	     {
	    	 try {
	    		 driver.findElement(By.id("loginclose1")).click();
	    		 break;
			} catch (Exception e) {
				Thread.sleep(1000);
			}
	     }
	     	driver.findElement(By.cssSelector("img[alt='Modular Furniture']")).click();
	}
}
