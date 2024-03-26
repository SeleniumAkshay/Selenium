package Selenium;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTab {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.facebook.com");
		
//		driver.switchTo().newWindow(WindowType.TAB);
//		
//		Set<String> ids = driver.getWindowHandles();
//		
//		for (String string : ids) {
//			driver.switchTo().window(string);
//		}
//		driver.get("https://www.flipkart.com");
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.open();");
		
		Thread.sleep(3000);
		driver.quit();
		
	}

}
