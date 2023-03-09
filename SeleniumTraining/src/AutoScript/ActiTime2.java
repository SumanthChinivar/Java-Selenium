package AutoScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * 
 * @TestAuthor GulshanKumar
 */
public class ActiTime2 {
	public static void main(String[] args) throws InterruptedException {
		//Expected Data
		String username="admin";
		String password="manager";
		String expectedLoginPageTitle="actiTIME - Login";
		String expectedHomePageTitle="actiTIME - Enter Time-Track";
		
		//Step 1: Open the browser
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		System.out.println("Browser is launched");
		driver.manage().window().maximize();
		System.out.println("Browser is maximized");
		
		//Step 2: Enter the test URL and click on enter button
		driver.get("https://demo.actitime.com/login.do");
		String actualLoginPageTitle=driver.getTitle();
		if(actualLoginPageTitle.equals(actualLoginPageTitle)) {
			System.out.println("Login page is displayed successfully");
		}
		else
			System.out.println("Login page is not displayed");
		
		//Step 3:Click on the 'username' text field and provide the input
		WebElement usernameTextfield=driver.findElementById("username");
		usernameTextfield.clear();
		usernameTextfield.sendKeys(username);
		String actualDataEnteredInUserNameTextField=usernameTextfield.getAttribute("value");
		if(actualDataEnteredInUserNameTextField.equals(username))
		{
			System.out.println("Username Text field accepted the test data");
		}
		else
			System.out.println("Username text field failed to accept the data");
		
		//Step 4: Click on the 'password' text field and provide the input
		WebElement passwordTextfield=driver.findElementByName("pwd");
		passwordTextfield.clear();
		passwordTextfield.sendKeys(password);
		String actualDataEnteredInPasswordTextField=passwordTextfield.getAttribute("value");
		if(actualDataEnteredInPasswordTextField.equals(password))
		{
			System.out.println("password text field accepted the test data");
		}
		else
		{
			System.out.println("Password tetxfield didinot accepted the test data");
		}
		
		//Step 5:Click on Login button
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		String actualHomePageTitle=driver.getTitle();
		if(expectedHomePageTitle.equals(actualHomePageTitle))
		{
			System.out.println("Home Page is displayed successfully");
		}
		else
			System.out.println("Home page is not displayed");
	}
}
