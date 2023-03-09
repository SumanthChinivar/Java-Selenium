package actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Upload {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		
		driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
		
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(3000);
		
		robot.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);		
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_TAB);
		
		
	}
}
