package org.Adyen.Testscripts;

import java.io.IOException;

import org.Adyen.utilities.BaseClass;
import org.Adyen.webpages.AccountSettingsWebElements;
import org.Adyen.webpages.OnboardingPageWebElements;
import org.Adyen.webpages.PhoneNumberSectionPageWebElements;
import org.Adyen.webpages.PrepaidAccountPageWebElements;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ChecoutForSubscriptionOfPhoneNumberUsingGpay_TC0013 extends BaseClass {
	@Test
	public void testChecoutForSubscriptionOfPhoneNumberUsingGpay_TC0013()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
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
		pnsp.EnterCountryName();
		Thread.sleep(2000);
		pnsp.ClickOnCountryName();
		Thread.sleep(5000);
		pnsp.SelectPhoneNumber();
		Thread.sleep(2000);
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
		pawe.clickonPaymentMethod();
		Thread.sleep(2000);
		pnsp.ClickOnConfirmAndPayNowButton();
		Thread.sleep(5000);
		pawe.Closepopup();
		Thread.sleep(5000);
		WebElement conformation = driver.findElement(By.xpath("//div[@class='_2D7kLBR9gPH_c4D2hAZGCw']"));
		System.out.println(conformation);
		Thread.sleep(2000);
	}
}
