package org.Adyen.utilities;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.compress.archivers.dump.InvalidFormatException;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
	public static WebDriver driver;
//	public static ChromeOptions options;
	public static final Logger log = LogManager.getLogger(BaseClass.class);

	@BeforeSuite
	public void OpenBrowser() throws IOException, EncryptedDocumentException, InvalidFormatException,
			org.apache.poi.openxml4j.exceptions.InvalidFormatException {
		BasicConfigurator.configure();

	}

	@BeforeClass
	public void Login() throws EncryptedDocumentException, InvalidFormatException, IOException,
			org.apache.poi.openxml4j.exceptions.InvalidFormatException, InterruptedException {
		String browser = ExcelOperation.Readdata("Sheet1", 1, 6);
		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver.exe");
			log.info(".......Chrome browser opened..........");
//			ChromeOptions options = new ChromeOptions();
//			options.addArguments("--incognito");
//			log.info("...opened Incognito mode........ ");
			driver = new ChromeDriver();
		} else if (browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/drivers/geckodriver.exe");
			driver = new FirefoxDriver();
			log.info(".......Mozilla browser opened..........");
		}
		String url = ExcelOperation.Readdata("Sheet1", 1, 3);
		driver.get(url);
		log.info(".....Url entered...........");
		driver.manage().window().maximize();
		log.info(".....clicked on maximise button....");
		Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String emailid = ExcelOperation.Readdata("Sheet1", 1, 4);
		String password = ExcelOperation.Readdata("Sheet1", 1, 5);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(emailid);
		Thread.sleep(5000);
		log.info(".....entered email id.........");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
		log.info(".....pwd entered.......");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[contains(text(),'Sign in')]")).click();
		log.info(".....Login button clicked.......");
	}

	@AfterClass
	public void Logout() throws InterruptedException {
		{
			// log.info("....clicked on settings link....");
			driver.findElement(By.xpath("(//div[contains(@class,'1R6RzeGBKgpu7PjhkbUDBM ')]/button)[1]")).click();
			Thread.sleep(2000);
			log.info("....clicked on logout button....");
			driver.findElement(By.xpath("//button[contains(text(),'Sign out')]")).click();
			Thread.sleep(2000);
			driver.close();
		}

	}

}
