package Selenium;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Zoom {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
//		js.executeScript("document.body.style.zoom='50%';");
		js.executeScript("document.body.style.MozTransform='scale(2)';");
		
		
		Thread.sleep(3000);
		driver.quit();
	}

}
