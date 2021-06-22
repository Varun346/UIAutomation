package Sonetel.AutomationTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class incogni {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--incognito");
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		

	}
}
