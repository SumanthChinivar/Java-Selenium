package dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SkillRary {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.get("https://demoapp.skillrary.com/");
		
		WebElement dropdown=driver.findElement(By.xpath("//select[@id='cars']"));
		Select selectPrice=new Select(dropdown);
		selectPrice.selectByIndex(0);
		selectPrice.selectByVisibleText("INR 300 - INR 399 ( 1 )");
		selectPrice.selectByIndex(2);
		List<WebElement> all = selectPrice.getAllSelectedOptions();
		for(WebElement e:all)
		{
			System.out.println(e.getText());
		}
	}
}
