package org.Adyen.Testscripts;

import java.io.IOException;

import org.Adyen.utilities.BaseClass;
import org.Adyen.webpages.AccountSettingsWebElements;
import org.Adyen.webpages.OnboardingPageWebElements;
import org.Adyen.webpages.PhoneNumberSectionPageWebElements;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class PurchasingPhonenumber_TC0012 extends BaseClass {
	@Test
	public void testPurchasingPhonenumber_TC0012()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
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
		pnsp.ClickOnAddToCart();
		Thread.sleep(10000);
		pnsp.ClickOnCartIcon();
		Thread.sleep(2000);
		pnsp.ClickOnConformAndPayButton();
		Thread.sleep(5000);
		String conformation = driver.findElement(By.xpath("//div[@class='_2D7kLBR9gPH_c4D2hAZGCw']")).getText();
		System.out.println(conformation);
		Thread.sleep(2000);
	}
}