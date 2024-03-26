package Selenium;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportsEx {
	
	public static void main(String[] args) {
		
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
		
		report.flush();
		
	}

}
