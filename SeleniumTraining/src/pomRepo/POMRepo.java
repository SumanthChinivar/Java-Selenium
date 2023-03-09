package pomRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class POMRepo {

	@FindBy(linkText ="Register")
	private WebElement register;

	public WebElement getRegister() {
		return register;
	}
	
	@FindBy(linkText ="Log in")
	private WebElement login;
	
	public WebElement getLogin()
	{
		return login;
	}
	
	@FindBy(xpath ="//span[text()='Shopping cart']")
	private WebElement shoppingCart;
	
	public WebElement getShoppingCart()
	{
		return shoppingCart;
	}
	
	@FindBy(id="small-searchterms")
	private WebElement searchTextField;

	public WebElement getSearchTextField() {
		return searchTextField;
	}
	
	@FindBy(xpath = "//input[@value='Search']")
	private WebElement searchButton;

	public WebElement getSearchButton() {
		return searchButton;
	}
	
	@FindBy(partialLinkText = "Books")
	private WebElement books;

	public WebElement getBooks() {
		return books;
	}
	
	@FindBy(partialLinkText = "Computers")
	private WebElement computer;

	public WebElement getComputer() {
		return computer;
	}
	
	@FindBy(partialLinkText ="Desktops")
	private WebElement desktop;
	
	public WebElement getDesktop()
	{
		return desktop;
	}
	
	@FindBy(partialLinkText = "Notebooks")
	private WebElement notebook;

	public WebElement getNotebook() {
		return notebook;
	}
	
	@FindBy(partialLinkText = "Accessories")
	private WebElement accessories;

	public WebElement getAccessories() {
		return accessories;
	}
	
	@FindBy(partialLinkText = "Electronics")
	private WebElement electronics;

	public WebElement getElectronics() {
		return electronics;
	}
	
	@FindBy(partialLinkText = "Camera, photo")
	private WebElement cameraPhoto;

	public WebElement getCameraPhoto() {
		return cameraPhoto;
	}
	
	@FindBy(partialLinkText = "Cell phones")
	private WebElement cellPhones;

	public WebElement getCellPhones() {
		return cellPhones;
	}
	
	@FindBy(partialLinkText = "Apparel & Shoes")
	private WebElement apparelShoes;

	public WebElement getApparelShoes() {
		return apparelShoes;
	}
	
	@FindBy(partialLinkText = "Digital downloads")
	private WebElement digitalDownloads;

	public WebElement getDigitalDownloads() {
		return digitalDownloads;
	}
	
	@FindBy(partialLinkText = "Jewelry")
	private WebElement jewelry;

	public WebElement getJewelry() {
		return jewelry;
	}
	
	@FindBy(xpath = "Gift Cards")
	private WebElement giftCards;

	public WebElement getGiftCards() {
		return giftCards;
	}
	
	@FindBy(id="gender-male")
	private WebElement maleRadioButton;

	public WebElement getMaleRadioButton() {
		return maleRadioButton;
	}
	
	@FindBy(id="gender-female")
	private WebElement femaleRadioButton;

	public WebElement getFemaleRadioButton() {
		return femaleRadioButton;
	}
	
	@FindBy(id="FirstName")
	private WebElement firstNameTextField;

	public WebElement getFirstNameTextField() {
		return firstNameTextField;
	}
	
	@FindBy(id="LastName")
	private WebElement lastNameTextField;

	public WebElement getLastNameTextField() {
		return lastNameTextField;
	}
	
	@FindBy(id="Email")
	private WebElement emailTextField;

	public WebElement getEmailTextField() {
		return emailTextField;
	}
	
	
}
