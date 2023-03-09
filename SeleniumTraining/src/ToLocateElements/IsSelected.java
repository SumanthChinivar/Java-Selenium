package ToLocateElements;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	    ChromeDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	     
	    driver.get("https://demowebshop.tricentis.com/");
	    driver.findElement(By.xpath("//a[contains(@href,'/register')]")).click();
	    System.out.println(driver.findElement(By.xpath("//input[contains(@id,'gender-male')]")).isDisplayed());
	    System.out.println(driver.findElement(By.xpath("//input[contains(@id,'gender-male')]")).isSelected());
	    
	    driver.findElement(By.xpath("//input[contains(@id,'gender-male')]")).click();
	    System.out.println(driver.findElement(By.xpath("//input[contains(@id,'gender-male')]")).isSelected());
	}
}
