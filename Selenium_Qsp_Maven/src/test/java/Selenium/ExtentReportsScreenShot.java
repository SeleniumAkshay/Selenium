package Selenium;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportsScreenShot {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		ExtentSparkReporter spark=new ExtentSparkReporter("./reports/first.html");
		spark.config().setDocumentTitle(" CRM Test Suite Results ");
		spark.config().setReportName(" CRM Report ");
		spark.config().setTheme(Theme.DARK);
		ExtentReports report=new ExtentReports();
		
		report.attachReporter(spark);
		report.setSystemInfo("Os","Windows");
		report.setSystemInfo("Browser","Chrome-100");
		
		ExtentTest test = report.createTest("Demo");
		
		test.log(Status.INFO,"Started");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.facebook.com");
		
		Thread.sleep(2000);
		String path="./screenshot/file.png";
		TakesScreenshot ts=(TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File(path);
		FileHandler.copy(temp, dest);

		test.addScreenCaptureFromPath("."+path);
		
		report.flush();
		
		Thread.sleep(3000);
		driver.quit();
		
	}

}
