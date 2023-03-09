package ToLocateElements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogInSpotify {
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
		driver.findElement(By.xpath("//span[text()='Log in']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("login-username")).sendKeys("sumanthchinivar@hotmail.com");
		driver.findElement(By.id("login-password")).sendKeys("Rowdy@123");
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//a[@href='/search']")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//input[contains(@data-testid,'search-input')]")).sendKeys("kgf chapter 2 kannada");
		Thread.sleep(8000);
		for(;;)
		{
			try
			{
				driver.findElementById("onetrust-close-btn-container").click();
				break;
			}
			catch(Exception e)
			{
				Thread.sleep(1000);
			}
		}
        driver.findElement(By.xpath("//a[@href='/album/61o7rl6Tsa8CIYCcmIdVS2']")).click();
        Thread.sleep(7000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");
        driver.findElement(By.xpath("//button[contains(@aria-label,'Play Toofan')]")).click();
	}
}
