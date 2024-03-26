package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressFormPage {
	
	public AddressFormPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindAll({@FindBy(id = "Name"),@FindBy(name = "Name")})
	private WebElement nameTb;
	
	@FindBy(xpath = "//input[contains(@id,'House/Office')]")
	private WebElement houseTb;
	
	@FindBy(xpath = "//input[contains(@id,'Street')]")
	private WebElement streetTb;
	
	@FindBy(id = "Landmark")
	private WebElement landmarkTb;
	
	@FindBy(id = "Country")
	private WebElement countryDd;
	
	@FindBy(id = "State")
	private WebElement stateDd;
	
	@FindBy(id = "City")
	private WebElement cityDd;
	
	@FindBy(id = "Pincode")
	private WebElement pincodeTb;
	
	@FindBy(xpath = "//input[contains(@id,'Phone')]")
	private WebElement phoneTb;
	
	@FindBy(xpath = "//button[text()='Add Address']")
	private WebElement addAddressBtn;

	public WebElement getNameTb() {
		return nameTb;
	}

	public WebElement getHouseTb() {
		return houseTb;
	}

	public WebElement getStreetTb() {
		return streetTb;
	}

	public WebElement getLandmarkTb() {
		return landmarkTb;
	}

	public WebElement getCountryDd() {
		return countryDd;
	}

	public WebElement getStateDd() {
		return stateDd;
	}

	public WebElement getCityDd() {
		return cityDd;
	}

	public WebElement getPincodeTb() {
		return pincodeTb;
	}

	public WebElement getPhoneTb() {
		return phoneTb;
	}

	public WebElement getAddAddressBtn() {
		return addAddressBtn;
	}
	

}
