package dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		WebElement dateDropDown = driver.findElement(By.id("day"));
		WebElement monthdDropDown = driver.findElement(By.id("month"));
		WebElement yearDropDown = driver.findElement(By.id("year"));
		
		Select day = new Select(dateDropDown);
		Select month=new Select(monthdDropDown);
		Select year=new Select(yearDropDown);
		
		day.selectByIndex(0);
		month.selectByValue("12");
		year.selectByVisibleText("2012");
		System.out.println(year.getFirstSelectedOption().getText());
		
		List<WebElement> allMonthOption = month.getOptions();
		
		for(WebElement s:allMonthOption)
		{
			System.out.println(s.getText());
		}
	}
}
