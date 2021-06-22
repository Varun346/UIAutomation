package org.Adyen.utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class GenerateReport extends TestListenerAdapter {
	ExtentSparkReporter reporter;

	ExtentReports extent;

	ExtentTest test;

	public void onStart(ITestContext testcontext) {
		String date = new SimpleDateFormat("yyMMddhhmmss").format(new Date());
		String rep = "Test-Report" + date + ".html";
		reporter = new ExtentSparkReporter(System.getProperty("user.dir") + "/reports/" + rep);
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		reporter.config().setDocumentTitle("Adyen");
		reporter.config().setReportName("Gpay Test Report");
		reporter.config().setTheme(Theme.DARK);
		extent.setSystemInfo("QA", "Sonetel");
		extent.setSystemInfo("OS", "Windows");
		extent.setSystemInfo("Browser", "Google chrome");
	}

	public void onFinish(ITestContext testcontext) {

		extent.flush();
	}

	public void onTestSuccess(ITestResult rv) {
		test = extent.createTest(rv.getName());
		test.log(Status.PASS, MarkupHelper.createLabel(rv.getName(), ExtentColor.GREEN));
	}

	public void onTestFailure(ITestResult rv) {
		test = extent.createTest(rv.getName());
		test.log(Status.FAIL, MarkupHelper.createLabel(rv.getName(), ExtentColor.RED));

		EventFiringWebDriver efw = new EventFiringWebDriver(BaseClass.driver);
		File f1 = efw.getScreenshotAs(OutputType.FILE);
		String date = new SimpleDateFormat("yyMMddhhmmss").format(new Date());
		String path = System.getProperty("user.dir") + "//Screenshot//" + rv.getName() + date + ".jpg";
		File f2 = new File(path);
		try {
			FileUtils.copyFile(f1, f2);
			test.addScreenCaptureFromPath(path);

			System.out.println("This line is executed");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void onTestSkipped(ITestResult rv) {
		test = extent.createTest(rv.getName());
		test.log(Status.SKIP, MarkupHelper.createLabel(rv.getName(), ExtentColor.ORANGE));

	}
}
