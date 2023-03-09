package ToLocateElements;

import java.util.List;
import java.util.Set;
import java.util.TreeMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThreeProductChallenge {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");

		
		  Thread.sleep(7000);
		  driver.findElement(By.xpath("//button[contains(@class,'_2KpZ6l _2doB4z')]")).
		  click(); Thread.sleep(3000);
		  driver.findElement(By.xpath("//input[contains(@name,'q')]")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//input[contains(@name,'q')]")).sendKeys("smart tv");
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//button[contains(@class,'L0Z3Pu')]")).click();
		  Thread.sleep(3000); 
		  driver.findElement(By.xpath("//img[contains(@alt,'OnePlus Y1 80 cm (32 inch) HD Ready LED Smart Android TV with Dolby Audio')]")).click(); 
		  Thread.sleep(3000); 
		  String parent = driver.getWindowHandle();
		  Set<String> all = driver.getWindowHandles(); 
		  all.remove(parent); 
		  for (String id : all) {
		  driver.switchTo().window(id); } Thread.sleep(3000);
		  driver.findElementByXPath("//button[text()='Add to cart']").click();
		  Thread.sleep(3000);
		 
		
		  
		  
		 driver.findElementByXPath("//img[contains(@title,'Flipkart')]").click();
		  for(;;) {
		  try{
		  driver.findElement(By.xpath("//button[contains(@class,'_2KpZ6l _2doB4z')]")).click();
		  break; } 
		  catch(Exception e) 
		  { 
			  Thread.sleep(3000); 
			  }
		  }
		  driver.findElement(By.xpath("//img[contains(@alt,'Mobiles')]")).click();
		  Thread.sleep(3000); 
		  driver.findElement(By.xpath("//div[contains(@class,'_3879cV') and text()='realme']")).click();
		  Thread.sleep(3000); driver.findElement(By.xpath("//img[contains(@alt,'realme C33 (Night Sea, 32 GB)')]")).click();
		  Thread.sleep(3000); String parent1=driver.getWindowHandle(); 
		  Set<String> alld=driver.getWindowHandles();
		  alld.remove(parent1); 
		  for(String id:alld) {
		  driver.switchTo().window(id);
		  } 
		  Thread.sleep(3000);
		  driver.findElementByXPath("//button[text()='Add to cart']").click();
		  
		  
		//driver.findElement(By.xpath("//button[contains(@class,'_2KpZ6l _2doB4z')]")).click();
		  Thread.sleep(3000);
		driver.findElementByXPath("//img[contains(@title,'Flipkart')]").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//input[contains(@name,'q')]").click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[contains(@name,'q')]")).sendKeys("Laptops");
		driver.findElement(By.xpath("//button[contains(@type,'submit')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[contains(@alt,'RedmiBook Pro Core i5 11th Gen - (8 GB/512 GB SSD/Windows 11 Home) Thin and Light Laptop')]")).click();
		String win = driver.getWindowHandle();
		Set<String> awin = driver.getWindowHandles();
		awin.remove(win);
		for (String id : awin) {
			driver.switchTo().window(id);
		}
		Thread.sleep(3000);
		driver.findElementByXPath("//button[text()='Add to cart']").click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[text()='Cart']")).click();
		Thread.sleep(3000);
		List<WebElement> ele = driver.findElementsByXPath("//div[text()='Save for later']/../../..//span[contains(text(),'₹')]");
		
		String[] a = new String[6];
		
		int i=0;
		for(WebElement b: ele)
		{
			a[i]=b.getText();
			a[i]=a[i].replace("₹","").replace(",", "");
			System.out.println(a[i++]);
			
		}
		
		
		  int small=Integer.parseInt(a[1]); a[3]=a[3].replace("₹",""); 
		  int a2=Integer.parseInt(a[3]); 
		  a[5]=a[5].replace("₹",""); 
		  int a3=Integer.parseInt(a[5]);
		  
		  if(small>a2 && a2<a3)
		  { 
			  small=a2;
		  } 
		  else if(a3<small) 
		  { 
			  small=a3; 
			  }
		  System.out.println("The smallest element is:"+small);
		 
	}
}
