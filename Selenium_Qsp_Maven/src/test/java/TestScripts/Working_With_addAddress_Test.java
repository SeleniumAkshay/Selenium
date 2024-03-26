package TestScripts;

import java.io.IOException;

import org.testng.annotations.Test;

import Generic.BaseClass;
import Generic.ExcelData;
import Generic.WebDriverUtility;
import Pom.AddressFormPage;
import Pom.HomePage;
import Pom.LoginPage;
import Pom.MyAddressPage;
import Pom.MyProfilePage;
import Pom.WelcomePage;

public class Working_With_addAddress_Test extends BaseClass{
	
	@Test
	public void addAddress() throws IOException, InterruptedException {
		ExcelData excel=new ExcelData();
		WebDriverUtility wu=new WebDriverUtility();
		
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
		Thread.sleep(1000);
		MyAddressPage map=new MyAddressPage(driver);
		map.getAddAddressBtn().click();
		
		AddressFormPage afp=new AddressFormPage(driver);
		afp.getNameTb().sendKeys(excel.readExcelData("Sheet1", 1, 0));
		afp.getHouseTb().sendKeys(excel.readExcelData("Sheet1", 1, 1));
		afp.getStreetTb().sendKeys(excel.readExcelData("Sheet1", 1, 2));
		afp.getLandmarkTb().sendKeys(excel.readExcelData("Sheet1", 1, 3));
		
		wu.dropDown(afp.getCountryDd(),pf.readPropertyData("country"));
		wu.dropDown(afp.getStateDd(),pf.readPropertyData("state"));
		wu.dropDown(afp.getCityDd(),pf.readPropertyData("city"));
		
		afp.getPincodeTb().sendKeys(excel.readExcelData("Sheet1", 1, 4)); 
		afp.getPhoneTb().sendKeys(excel.readExcelData("Sheet1", 1, 5));
		afp.getAddAddressBtn().click();
		Thread.sleep(1000);
		map.getCrossBtn().click();
		hp.getAccountBtn().click();
		Thread.sleep(1000);
		hp.getLogoutBtn().click();
		
	}
	
}
