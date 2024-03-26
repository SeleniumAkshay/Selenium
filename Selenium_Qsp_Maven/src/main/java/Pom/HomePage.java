package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//span[contains(@class,'Base')])[2]")
	private WebElement accountBtn;
	
	@FindBy(xpath = "//li[text()='My Profile']")
	private WebElement myProfileLink;
	
	@FindBy(xpath = "//li[text()='Logout']")
	private WebElement logoutBtn;

	public WebElement getAccountBtn() {
		return accountBtn;
	}

	public WebElement getMyProfileLink() {
		return myProfileLink;
	}

	public WebElement getLogoutBtn() {
		return logoutBtn;
	}
	
	

}
