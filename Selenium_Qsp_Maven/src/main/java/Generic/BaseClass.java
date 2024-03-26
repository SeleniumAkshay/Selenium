package Generic;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	
	@BeforeSuite
	public void bs() {
		System.out.println("@BeforeSuite");
	}
	@BeforeTest
	public void bt() {
		System.out.println("@BeforeTest");
	}	
	public PropertyFile pf=new PropertyFile();
	public WebDriver driver;
	@BeforeClass
	public void bc() throws IOException {
		String browser = pf.readPropertyData("browser");
		String url = pf.readPropertyData("url");
		System.out.println("@BeforeClass");
		
		if (browser.equals("chrome")) {
//			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if (browser.equals("firefox")) {
//			System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
			driver=new FirefoxDriver();
		}else if (browser.equals("edge")) {
//			System.setProperty("webdriver.edge.driver","./driver/msedgedriver.exe");
			driver=new EdgeDriver();
		}
		else {
			System.out.println("Enter Valid browser");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(url);
	}	
	@BeforeMethod
	public void bm() {
		System.out.println("@BeforeMethod");
	}	
	@AfterMethod
	public void am() {
		System.out.println("@AfterMethod");
	}	
	@AfterClass
	public void ac() throws InterruptedException {
		System.out.println("@AfterClass");
		Thread.sleep(3000);
		driver.quit();
	}	
	@AfterTest
	public void at() {
		System.out.println("@AfterText");
	}
	
	@AfterSuite
	public void as() {
		System.out.println("@AfterSuite");
	}
}
