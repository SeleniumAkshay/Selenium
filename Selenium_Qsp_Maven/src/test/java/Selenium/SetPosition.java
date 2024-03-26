package Selenium;

import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPosition {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.facebook.com");
		
//		Point pos = driver.manage().window().getPosition();
//		System.out.println(pos);
//		Thread.sleep(2000);
//		Point point=new Point(500,0);
//		
//		driver.manage().window().setPosition(point);
//		Thread.sleep(2000);
//		pos = driver.manage().window().getPosition();
//		System.out.println(pos);
//		Thread.sleep(2000);
		Dimension size = driver.manage().window().getSize();
		System.out.println(size);
		Thread.sleep(2000);
		Dimension si=new Dimension(2000, 1000);
		
		driver.manage().window().setSize(si);
		Thread.sleep(2000);
		size = driver.manage().window().getSize();
		System.out.println(size);
		
		Thread.sleep(3000);
		driver.quit();
	}

}
