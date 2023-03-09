package RemoteWebDriver;

import org.openqa.selenium.edge.EdgeDriver;

public class GetTitle {
public static void main(String[] args) {
	System.setProperty("webdriver.edge.driver", "./driver/msedgedriver.exe");
	EdgeDriver driver=new EdgeDriver();
	
	driver.get("https://google.com");
	String title=driver.getTitle();
	System.out.println("The title is:"+title);
	
	driver.get("http://instgram.com");
	System.out.println("The title is:"+driver.getTitle());
}
}
