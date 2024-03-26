package TestScripts;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Generic.BaseClass;
import Pom.HomePage;
import Pom.LoginPage;
import Pom.MyProfilePage;
import Pom.WelcomePage;

public class DeleteAddress_Test extends BaseClass{

	@Test
	public void delete() throws IOException, InterruptedException {
		//(//button[text()='Yes'])[1]

//		ExcelData excel=new ExcelData();
//		WebDriverUtility wu=new WebDriverUtility();

		WelcomePage wp=new WelcomePage(driver);
		wp.getLoginBtn().click();

		LoginPage lp=new LoginPage(driver);
		lp.getEmailTb().sendKeys(pf.readPropertyData("un"));
		lp.getPwdTb().sendKeys(pf.readPropertyData("pwd"));
		lp.getLoginBtn().click();

		HomePage hp=new HomePage(driver);
		hp.getAccountBtn().click();
		hp.getMyProfileLink().click();

		MyProfilePage mpp=new MyProfilePage(driver);
		mpp.getMyAddressBtn().click();

//		MyAddressPage map=new MyAddressPage(driver);
//		map.getAddAddressBtn().click();
		Thread.sleep(5000);
		List<WebElement> delete = driver.findElements(By.xpath("//div[contains(@class,'MuiCardA')]/div/button[@type='button']"));
		int count = delete.size();
		System.out.println("Delete Count : "+ count);
		List<WebElement> yes = driver.findElements(By.xpath("//button[text()='Yes']"));
		int count1 = yes.size();
		System.out.println("Yes Count :" +count1);
		for (int i = 0; i < count; i++) {
			delete.get(0).click();
			Thread.sleep(500);
			yes.get(i).click();
			Thread.sleep(1500);
			driver.switchTo().alert().accept();
			Thread.sleep(500);
			System.out.println(i);
		}
		Thread.sleep(3000);

	}

}
