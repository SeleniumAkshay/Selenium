package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "Email")
	private WebElement emailTb;
	
	@FindBy(id = "Password")
	private WebElement pwdTb;
	
	@FindBy(xpath = "//span[text()='Login']")
	private WebElement loginBtn;

	public WebElement getEmailTb() {
		return emailTb;
	}

	public WebElement getPwdTb() {
		return pwdTb;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
	
	

}
