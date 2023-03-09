package configurationAnnotations;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestOne extends BaseClass {

	@Test
	public void shopABook()
	{
//		SoftAssert softAssert=new SoftAssert();
		WebElement books = driver.findElement(By.xpath("(//a[contains(text(),'Books')])[1]"));
		books.click();
//		softAssert.assertEquals(driver.getCurrentUrl(), cred[5],"Books was not displayed");
		Reporter.log("Books page was displayed",true);
	
		//select a book and add to cart
		WebElement addToCart = driver.findElement(By.xpath("//div[@class='product-grid']/div[1]/div/div[2]/div[3]/div[2]/input"));
		addToCart.click();	
		
		//place an order
		WebElement cart = driver.findElement(By.xpath("//span[text()='Shopping cart']"));
		cart.click();
//		softAssert.assertEquals(driver.getTitle(),cred[6] , "Cart was not opened");
		Reporter.log("Cart  was displayed",true);
		
		WebElement terms = driver.findElement(By.xpath("//input[@id='termsofservice']"));
		terms.click();
		
		WebElement checkout = driver.findElement(By.id("checkout"));
		checkout.click();
//		softAssert.assertEquals(driver.getCurrentUrl(), cred[7],"Check Out page was not displayed");
		Reporter.log("Checkout page was displayed",true);
		
		WebElement billingAddress = driver.findElement(By.xpath("(//input[@title='Continue'])[1]"));
		billingAddress.click();
		
		WebElement shippingAddress = driver.findElement(By.xpath("(//input[@title='Continue'])[2]"));
		shippingAddress.click();
		
		WebElement shippingMethod = driver.findElement(By.xpath("(//input[@onclick='ShippingMethod.save()'])"));
		shippingMethod.click();
		
		WebElement paymentMethod = driver.findElement(By.xpath("(//input[@name='paymentmethod'])[1]"));
		paymentMethod.click();
		WebElement continueToInfo = driver.findElement(By.xpath("//input[@onclick='PaymentMethod.save()']"));
		continueToInfo.click();
		
		WebElement paymentInfo = driver.findElement(By.xpath("//input[@onclick='PaymentInfo.save()']"));
		paymentInfo.click();
		
		WebElement confirmOrder = driver.findElement(By.xpath("//input[@onclick='ConfirmOrder.save()']"));
		confirmOrder.click();
		
		WebElement orderConfirmed=driver.findElement(By.xpath("//div[@class='page checkout-page']"));
		WebElement orderConfirmedText = driver.findElement(By.xpath("//strong[text()='Your order has been successfully processed!']"));
//		softAssert.assertEquals(orderConfirmedText.getText(), cred[9],"Order not placed");
		Reporter.log("Order confirmed",true);

	}
}
