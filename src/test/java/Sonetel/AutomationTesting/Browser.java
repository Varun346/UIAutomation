package Sonetel.AutomationTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Browser {

	@Test
	public void Login() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://drivers//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://Adyen-app.sonetel.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElementByXPath("//input[@type='email']").sendKeys("quality_Test@sonetel.info");
		driver.findElementByXPath("//input[@type='password']").sendKeys("sonetel");
		driver.findElementByXPath("//button[contains(text(),'Sign in')]").click();
		Thread.sleep(10000);
		driver.findElementByXPath("(//div[contains(@class,'1R6RzeGBKgpu7PjhkbUDBM ')]/button)[1]").click();
		driver.findElement(By.linkText("Company settings")).click();
		driver.findElementByXPath("//button[contains(text(),'Billing')]").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//button[contains(text(),'Refill')]").click();
		driver.findElementByXPath("//button[contains(text(),'add payment method')]").click();
		driver.findElementByXPath("//*[@id='root']/div/div[2]/article/div/div[2]/div/div/div/div/div[1]/button")
				.click();
		driver.findElementByXPath("//input[@placeholder='John Doe']").sendKeys("John");
		driver.findElementByXPath("//input[@placeholder='xxxx xxxx xxxx xxxx']").sendKeys("5125860000000000");
		driver.findElementByXPath("//input[@placeholder='xxx']").sendKeys("000");
		driver.findElementByXPath("//input[@placeholder='xxx']/following::input[1]").click();
		driver.findElementByXPath("//input[@placeholder='xxx']/following::input[1]").sendKeys("06/21");
		driver.findElementByXPath("//button[contains(text(),'Add')]").click();
		// driver.findElementByXPath("//button[contains(text(),'Sign out')]").click();
	}
}
