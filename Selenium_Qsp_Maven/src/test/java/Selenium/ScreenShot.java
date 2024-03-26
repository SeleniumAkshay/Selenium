package Selenium;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.facebook.com");

		Thread.sleep(2000);
		String path="./screenshot/first.png";
		TakesScreenshot ts=(TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File(path);
		FileHandler.copy(temp, dest);


		Thread.sleep(3000);
		driver.quit();

	}

}
