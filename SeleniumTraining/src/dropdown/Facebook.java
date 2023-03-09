package dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C550525805511%7Cb%7Chow%20to%20create%20facebook%7C&placement=&creative=550525805511&keyword=how%20to%20create%20facebook&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221432%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-8435546410%26loc_physical_ms%3D1007768%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=EAIaIQobChMIhuOtqPiF_QIVGJNmAh2XgAMGEAAYASAAEgKP6_D_BwE");
		WebElement dayDropDown=driver.findElement(By.id("day"));
		WebElement monthDropDown=driver.findElement(By.id("month"));
		WebElement yearDropDown=driver.findElement(By.id("year"));
		
		Select daySelect=new Select(dayDropDown);
		Select monthSelect=new Select(monthDropDown);
		Select yearSelect=new Select(yearDropDown);
		
		daySelect.selectByIndex(0);
		monthSelect.selectByValue("12");
		yearSelect.selectByValue("2023");
		
		List<WebElement> allMonthOption=monthSelect.getOptions();
		for(WebElement month: allMonthOption) {
			System.out.println(month.getText());
			Thread.sleep(3000);
		}
	}
}
