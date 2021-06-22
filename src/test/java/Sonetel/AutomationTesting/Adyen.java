package Sonetel.AutomationTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Adyen {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://adyen-app.sonetel.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("quality_Test@sonetel.info");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("sonetel");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'Sign in')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[contains(@class,'1R6RzeGBKgpu7PjhkbUDBM ')]/button)[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Company settings")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'Telephony')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//button[contains(@class,'k2Vfi-pf6lID_dwdIg5k3  false _9sdTT7FSFJ_bcf9Yo6dWp false false false')]"))
				.click();
		driver.findElement(By.xpath("//input[@placeholder='Search for a place']")).sendKeys("New jersey");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'New Jersey')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[contains(text(),'Free with Premium')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'Free with Premium')]/following::button")).click();
//		driver.findElement(By.xpath("//div[contains(text(),'United States')]")).click();
//		Thread.sleep(10000);
//		driver.findElement(By.xpath("//*[contains(text(),'Select city')]/following::span[1]")).click();
//		Thread.sleep(2000);
//		JavascriptExecutor js=((JavascriptExecutor)driver);
//		WebElement city = driver.findElement(By.xpath("//*[@id=\"react-select-3--value\"]/div[2]/input"));
//		js.executeScript("arguments[0].", args)
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter a string: ");
//		String str=sc.nextLine();
//		System.out.println("You have entered:"+str);
//		
//		Thread.sleep(2000);
//		List<WebElement> Options = driver
//				.findElements(By.xpath("//*[contains(text(),'Select city')]/following::span[1]"));
//		System.out.println(Options.size());
//		for (int i = 0; i <= Options.size() - 1; i++) {
//			if (Options.get(i).getText().contains("Dallas")) {
//				Options.get(i).click();
//				break;
//			}
//		}
//		driver.findElement(By.xpath("//button[contains(text(),'Billing')]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[contains(text(),'Refill')]")).click();	
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[contains(text(),'Google Pay')]")).click();
//		driver.findElement(By.xpath("//div[contains(text(),'Payment method')]/following::button[contains(text(),'Refill')]")).click();
//		String parent = driver.getWindowHandle();
//		System.out.println(parent);
//		driver.findElement(By.xpath("//button[@class='gpay-button white short en']")).click();
//		Thread.sleep(2000);
//		Set<String> allwindows = driver.getWindowHandles();
//		System.out.println(allwindows);
//		int count=allwindows.size();
//		System.out.println(count);
//		for(String child:allwindows)
//		{
//			
//			if(!parent.equalsIgnoreCase(child))
//			{
//				Thread.sleep(2000);
//				driver.switchTo().window(child);
//				driver.findElement(By.xpath("//input[@type='email']")).sendKeys("singam.varun46");
//				driver.findElement(By.xpath("//input[@type='email']")).sendKeys(Keys.ENTER);
//				//driver.findElement(By.xpath("//span[contains(text(),'Next')]"));
//				driver.findElement(By.xpath("//input[@type='password']")).sendKeys("varun@346");
//				driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
//				driver.findElement(By.xpath("//span[contains(text(),'Mastercard •••• 0006')]")).click();
//				driver.findElement(By.xpath("//div[contains(text(),'Continue')]")).click();
//				break;
//			}
//			
//		}
//		driver.switchTo().window(parent);
//		
	}

}
