package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//		driver.get("https://demowebshop.tricentis.com/");
		
		driver.navigate().to("https://demowebshop.tricentis.com/");
		WebElement ele = driver.switchTo().activeElement();
		System.out.println(ele);
		driver.findElement(By.linkText("Log in")).click();
		
		
		
		Thread.sleep(3000);
		driver.quit();
		
	}
	

}
