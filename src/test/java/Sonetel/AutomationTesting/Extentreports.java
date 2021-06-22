package Sonetel.AutomationTesting;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Extentreports 
{
	public static ExtentReports extent;
	public static ExtentTest test;
	@BeforeTest
	public ExtentReports ExtentDemo()
	{
		String path=System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter reporter=new ExtentSparkReporter(path);
		reporter.config().setReportName("Adyen-Gpay");
		reporter.config().setDocumentTitle("Test Results");
		reporter.config().setTheme(Theme.DARK);
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("QA","Sonetel");
		return extent;
	}
	@Test
	public void initialDemo()
	{
		test=extent.createTest("initial Demo");
		System.setProperty("webdriver.chrome.driver","c://drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://app.sonetel.com");
		extent.flush();
	}
}
