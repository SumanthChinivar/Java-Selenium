package RemoteWebDriver;



import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageWindowAndGetPosition {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println(driver.manage().window().getPosition().getX());
		System.out.println(driver.manage().window().getPosition().getY());
		driver.manage().window().setPosition(new Point(0,0));
		
	}
}
