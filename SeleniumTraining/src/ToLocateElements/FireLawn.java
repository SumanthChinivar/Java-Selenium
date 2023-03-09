package ToLocateElements;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FireLawn{
	public static void main(String[] args) throws InterruptedException {
	     System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	     ChromeDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     
	     driver.get("https://shoppersstack.com/");
	     Thread.sleep(6000);
	     driver.findElement(By.id("fl_login_btn")).click();
	     Thread.sleep(2000);
	     driver.findElement(By.id("fl_create_account")).click();
	     Thread.sleep(2000);
	     driver.findElement(By.id("fl_firstName_Shopper")).sendKeys("Sumanth");
	     Thread.sleep(2000);
	     driver.findElement(By.id("fl_lastName_Shopper")).sendKeys("Chinivar");
	     Thread.sleep(2000);
	     driver.findElement(By.id("fl_male_Shopper")).click();
	     Thread.sleep(2000);
	     driver.findElement(By.id("fl_phoneNumber_Shopper")).sendKeys("9449283836");
	     driver.findElement(By.id("fl_email_Shopper")).sendKeys("sumanthchinivar16@gmail.com");
	     driver.findElement(By.id("fl_password_Shopper")).sendKeys("A1!alkjh");
	     driver.findElement(By.id("fl_confirmPassword_Shopper")).sendKeys("A1!alkjh");
	     driver.findElement(By.id("fl_tc_Shopper")).click();
	     driver.findElement(By.id("fl_btnDisabled_Shopper")).click();
	     
	}
}
