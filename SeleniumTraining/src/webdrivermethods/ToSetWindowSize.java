package webdrivermethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSetWindowSize {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://drive.google.com/");
		
		Point positionofBrowser=driver.manage().window().getPosition();
		System.out.println(positionofBrowser.getX());
		System.out.println(positionofBrowser.getY());
		
		driver.manage().window().setSize(new Dimension(5000,1280));
		Thread.sleep(1000);
		driver.manage().window().setPosition(new Point(0,0));

	}
}
