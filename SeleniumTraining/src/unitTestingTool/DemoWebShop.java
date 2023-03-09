package unitTestingTool;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DemoWebShop {

	@DataProvider(name="data",parallel=true)
	public String[][] sendData()
	{
		String[][] sarr= {{"Male","Srigandha","Raja","srigandharaja@gmail.com","Rowdy@123"},
						  {"Female","Sarasu","Shake","sarasu@shake.com","Rowdy@123"},
						  {"FeMale","Sharvari","Shrungara","sharavari@shrungara.com","Rowdy@123"},
						  {"Male","Sharavati","Shatrugna","sharavati@shatrugna.com","Rowdy@123"},
						  {"MAle","Sandesh","Nagaraju","sandesh@nagaraju.com","Rowdy@123"},
						  {"Male","Sanjay","Sharan","sanjay@sharan.com","Rowdy@123"},
						  {"Female","Vaishnavi","Sham","vaishnavi@sham.com","Rowdy@123"},
						  {"Female","Golden","gowri","goldengowri@gmail.com","Rowdy@123"},
						  {"Male","arun","gn","arungn@gmail.com","Rowdy@123"},
						  {"Female","Sheik","Samarth","sheiksamarth@gmail.com","Rowdy@123"}};
		return sarr;
	}
	
	@Test(dataProvider="data")
	public void register(String[] cred)
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/register");
		if(cred[0].toLowerCase().equals("male"))
		{
		driver.findElement(By.id("gender-male")).click();
		}	
		else if(cred[0].toLowerCase().equals("female"))
		{
			driver.findElement(By.id("gender-female")).click();
		}
		driver.findElement(By.id("FirstName")).sendKeys(cred[1]);
		driver.findElement(By.id("LastName")).sendKeys(cred[2]);
		driver.findElement(By.id("Email")).sendKeys(cred[3]);
		driver.findElement(By.id("Password")).sendKeys(cred[4]);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(cred[4]);
		driver.findElement(By.id("register-button")).click();
		}
}

