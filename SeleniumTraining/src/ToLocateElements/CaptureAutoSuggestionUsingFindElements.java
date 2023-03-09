package ToLocateElements;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureAutoSuggestionUsingFindElements {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.kalkifashion.com/");
		Thread.sleep(2000);
		
		driver.findElementById("search-input").click();
		List<WebElement> searchsuggestion = driver.findElementsByXPath("//div/ul/li/a[contains(@class,'search-results-link')]");
		System.out.println(searchsuggestion.size());
		for (WebElement webElement : searchsuggestion) {
			System.out.println(webElement.getText());
		}
	}
}
