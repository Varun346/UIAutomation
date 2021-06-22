package org.Adyen.Testscripts;

import org.Adyen.utilities.BaseClass;
import org.Adyen.webpages.AccountSettingsWebElements;
import org.Adyen.webpages.OnboardingPageWebElements;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ValidatingSavedGpayMethod_TC0015 extends BaseClass {
	@Test
	public void testValidatingSavedGPayMethod_TC0015() throws InterruptedException {
		OnboardingPageWebElements ope = new OnboardingPageWebElements();
		ope.ClickOnSettingsLink();
		ope.ClickOnCompanySettingLink();
		AccountSettingsWebElements ase = new AccountSettingsWebElements();
		ase.ClickBillingLink();
		ase.ClickPaymentMethods();
		boolean Gpay;
		try {
			driver.findElement(By.xpath("//div[contains(text(),'Google Pay')]"));
			System.out.println(Gpay = true);
			System.out.println("Gpay details are saved");
		} catch (Exception e) {
			Gpay = false;
			System.out.println("Gpay details are not saved");
		}
		Thread.sleep(2000);
	}
}
