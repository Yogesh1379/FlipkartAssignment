package pagepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy(xpath = "//button[.='✕']") private WebElement cancelLoginPopup;
	@FindBy(xpath = "//input[@name='q']") private WebElement searchTextBox;
	@FindBy(xpath = "//button[@type='submit']") private WebElement searchButton;
	@FindBy(xpath = "//div[.='Price -- Low to High']") private WebElement PriceLowToHigh;
	@FindBy(linkText = "2") private WebElement secondPage;
	@FindBy(xpath = "(//div[@class='_312yBx SFzpgZ'])[2]") private WebElement secondProduct;
	@FindBy(xpath = "(//div[@class='_312yBx SFzpgZ'])[3]") private WebElement thirdProduct;
	@FindBy(xpath = "//button[.='ADD TO CART']") private WebElement addtoCart;
	
	
	//----------------------------------------------------------------------
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	
	//-----------------------------------------------------------------------
	
	
	public WebElement getCancelLoginPopup() {
		return cancelLoginPopup;
	}
	public WebElement getAddtoCart() {
		return addtoCart;
	}


	public WebElement getSecondProduct() {
		return secondProduct;
	}


	public WebElement getThirdProduct() {
		return thirdProduct;
	}


	public WebElement getSearchTextBox() {
		return searchTextBox;
	}
	public WebElement getSearchButton() {
		return searchButton;
	}
	public WebElement getPriceLowToHigh() {
		return PriceLowToHigh;
	}
	public WebElement getSecondPage() {
		return secondPage;
	}
	
	
	
	//--------------------------------------------------------
	
	


}
