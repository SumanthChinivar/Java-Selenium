package ToLocateElements;



import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPerformCompatibilityTesting {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[contains(@href,'/login')]")).click();
		WebElement emailTextField = driver.findElement(By.xpath("//input[contains(@id,'Email')]"));
		WebElement passwordTextField=driver.findElement(By.xpath("//input[contains(@id,'Password')]")); 
		
		Rectangle emailRectObject=emailTextField.getRect();
		Rectangle passwordRectObject=passwordTextField.getRect();
		
	   if(emailRectObject.getX()==passwordRectObject.getX())
	   {
		System.out.println("Both the eleemnts are aligned properly to left");   
	   }
	   else
	   {
		   System.out.println("Alignment issues");
	   }
	   
	   if(emailRectObject.getX()+emailRectObject.getWidth()==passwordRectObject.getX()+passwordRectObject.getWidth())
	   {
		   System.out.println("Both the elements are aligned properly to the right");
	   }
	   else
	   {
		   System.out.println("Allignment issue");
	   }
	   
	   if(emailRectObject.getY()+emailRectObject.getHeight()+3<=passwordRectObject.getY())
	   {
		   System.out.println("Height allignment is proper");
	   }
	   else
		   System.out.println("Allignment issue");
	   
	}
}
