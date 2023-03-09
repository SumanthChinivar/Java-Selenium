package datadriven;

import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToReadDataFromJSON {
public static void main(String[] args) throws IOException, ParseException {
	FileReader fr=new FileReader("./testData/testData.json");
	
	JSONParser parser=new JSONParser();
	JSONObject obj=(JSONObject) parser.parse(fr);
	
	String testUrl=(String) obj.get("url");
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	driver.get(testUrl);
	
	System.out.println(obj.get("price"));
	System.out.println(obj.get("flag"));
}
}
