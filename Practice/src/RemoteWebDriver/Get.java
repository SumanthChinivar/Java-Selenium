package RemoteWebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Get 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://google.com");
		
		
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		FirefoxDriver driver1=new FirefoxDriver();
		driver1.get("https://in.search.yahoo.com/?fr2=inr");
		
		
		System.setProperty("webdriver.edge.driver","./driver/msedgedriver.exe");
		EdgeDriver driver2=new EdgeDriver();
		driver2.get("https://bing.com");
		
	}
}
