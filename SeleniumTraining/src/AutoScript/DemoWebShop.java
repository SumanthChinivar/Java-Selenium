package AutoScript;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShop {
	public static void main(String[] args) {
				//Expected Data
				String expectedResult="Please enter some search keyword";
				String url="https://demowebshop.tricentis.com/login";
				String title="Demo Web Shop. Login";
				
				
				//Step 1: Open the browser
				System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
				ChromeDriver driver=new ChromeDriver();
				System.out.println("Browser is launched");
				driver.manage().window().maximize();
				System.out.println("Browser is maximized");
				
				//Step 2: Enter the test URL and click on enter button
				driver.get(url);
				String pageTitle=driver.getTitle();
				if(pageTitle.contains(title))
				{
					System.out.println("Page title matches with expected title");
				}
				else
					System.out.println("Page title doesnot match with expected title");
				
				//Step 3: Click on search button
				WebElement search=driver.findElement(By.xpath("//input[@value='Search']"));
				search.click();
				
				//step 4: compare the actual popup with expected popup
				Alert popup = driver.switchTo().alert();
				if(popup.getText().equals(expectedResult))
				{
					System.out.println("TestCase passed");
				}
				else
					System.out.println("Test case failed");
				popup.dismiss();
	}
}
