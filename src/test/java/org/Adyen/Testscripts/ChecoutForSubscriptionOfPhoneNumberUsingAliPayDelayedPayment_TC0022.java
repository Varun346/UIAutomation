package org.Adyen.Testscripts;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.Adyen.utilities.BaseClass;
import org.Adyen.webpages.AccountSettingsWebElements;
import org.Adyen.webpages.AliPayHomePageWebElements;
import org.Adyen.webpages.OnboardingPageWebElements;
import org.Adyen.webpages.PaymentsMethodsSectionWebElements;
import org.Adyen.webpages.PhoneNumberSectionPageWebElements;
import org.Adyen.webpages.PrepaidAccountPageWebElements;
import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Test;

public class ChecoutForSubscriptionOfPhoneNumberUsingAliPayDelayedPayment_TC0022 extends BaseClass
{
	@Test
	public void testChecoutForSubscriptionOfPhoneNumberUsingAliPayDelayedPayment_TC0022() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		OnboardingPageWebElements ope = new OnboardingPageWebElements();
		ope.ClickOnSettingsLink();
		ope.ClickOnCompanySettingLink();
		AccountSettingsWebElements ase = new AccountSettingsWebElements();
		ase.ClickTelephonyLink();
		PhoneNumberSectionPageWebElements pnsp = new PhoneNumberSectionPageWebElements();
		pnsp.ClickAddLink();
		Thread.sleep(2000);
		pnsp.ClickOnSearchBox();
		Thread.sleep(2000);
		pnsp.EnterCityName();
		Thread.sleep(5000);
		pnsp.ClickOnCityName();
		Thread.sleep(5000);
		pnsp.SelectPhoneNumber();
		Thread.sleep(5000);
		pnsp.ClickOnSubscriptionDropdown();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[contains(text(),'3-year subscription')]")).click();
		Thread.sleep(5000);
		pnsp.ClickOnAddToCart();
		Thread.sleep(10000);
		pnsp.ClickOnCartIcon();
		Thread.sleep(5000);
		pnsp.ClickOnProceedToCheckOutButton();
		Thread.sleep(5000);
		PrepaidAccountPageWebElements pawe = new PrepaidAccountPageWebElements();
		pawe.ClickMasterCardLink();
		Thread.sleep(2000);
		pawe.ClickAddPayementLink();
		Thread.sleep(2000);
		pnsp.ClickOnConfirmAndPayNowButton();
		Thread.sleep(5000);
		PaymentsMethodsSectionWebElements pmsw=new PaymentsMethodsSectionWebElements();
		pmsw.ClickOnAlipayLink();
		Thread.sleep(5000);
		AliPayHomePageWebElements aphpw=new AliPayHomePageWebElements();
		aphpw.ClickPendingAuthorisedButton();
		Thread.sleep(2000);
		String message =driver.findElement(By.xpath("//div[contains(text(),'We’ll notify you when it’s done. This may take a few minutes.')]")).getText();
		System.out.println(message);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[contains(text(),'Ok')]")).click();
		Thread.sleep(85000);
		driver.navigate().refresh();
		Thread.sleep(5000);
		ase.ClickBillingLink();
		Thread.sleep(5000);
		ase.ClickTelephonyLink();
		Thread.sleep(2000);
		Actions a1 = new Actions(driver);
		a1.sendKeys(Keys.PAGE_DOWN).perform();
		String s = new SimpleDateFormat("YYYYMMDDHHmmss").format(new Date());
		System.out.println(s);
		Thread.sleep(5000);
		EventFiringWebDriver rv1 = new EventFiringWebDriver(BaseClass.driver);
		File f1 = rv1.getScreenshotAs(OutputType.FILE);
		File f2 = new File(System.getProperty("user.dir") + "/Phonenumbers/" + s + ".jpg");
		try {
			FileUtils.copyFile(f1, f2);
		} catch (IOException e) {
			e.printStackTrace();
		}
		Thread.sleep(2000);
		
	}
}
