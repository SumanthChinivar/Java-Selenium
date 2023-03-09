package ToLocateElements;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Spotify {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("spotify");
		Thread.sleep(2000);
		driver.findElement(By.name("btnK")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[href='https://open.spotify.com/']")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("button[data-encore-id='buttonTertiary']")).click();
		Thread.sleep(2000);
 		driver.findElement(By.id("email")).sendKeys("sumanthchinivar@hotmail.com");
		driver.findElement(By.id("confirm")).sendKeys("sumanthchinivar@hotmail.com");
		driver.findElement(By.id("password")).sendKeys("Rowdy@123");
		driver.findElement(By.id("displayname")).sendKeys("Sumanth");
		driver.findElement(By.id("year")).sendKeys("2000");
		driver.findElement(By.id("month")).sendKeys("October");
		driver.findElement(By.id("day")).sendKeys("21");
		driver.findElement(By.id("onetrust-close-btn-container")).click();
		driver.findElement(By.cssSelector("label[for='gender_option_male']")).click();
		driver.findElement(By.cssSelector("div[class='rc-anchor-logo-portrait']")).click();
		driver.findElement(By.cssSelector("button[type='submit']")).click();
	}
}
