package webdrivermethods;

import org.openqa.selenium.edge.EdgeDriver;

public class ToCaptureWindowID {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "./driver/msedgedriver.exe");
		EdgeDriver driver=new EdgeDriver();
		
		driver.get("https://www.partsbaba.com/");
		String windowID=driver.getWindowHandle();
		System.out.println(windowID);
	}
}