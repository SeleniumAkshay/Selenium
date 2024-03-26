package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAddressPage {

	public MyAddressPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[text()='Add Address']")
	private WebElement addAddressBtn;
	
	@FindBy(xpath = "(//*[name()='svg'])[2]")
	private WebElement crossBtn;

	public WebElement getAddAddressBtn() {
		return addAddressBtn;
	}

	public WebElement getCrossBtn() {
		return crossBtn;
	}
	
	

}
