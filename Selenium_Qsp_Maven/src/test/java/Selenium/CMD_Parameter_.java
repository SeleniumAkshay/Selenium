package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CMD_Parameter_ {
	
	@Test
	public void demo() throws InterruptedException {
		String url = System.getProperty("url");
		String pn = System.getProperty("pn");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(url);
		
		driver.findElement(By.name("q")).sendKeys(pn+Keys.ENTER);
		
		Thread.sleep(3000);
		driver.quit();
		
	}

}
