package org.Adyen.Testscripts;

import org.Adyen.utilities.BaseClass;
import org.Adyen.webpages.AccountSettingsWebElements;
import org.Adyen.webpages.OnboardingPageWebElements;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ValidatingSavedPayPalMethod_TC0016 extends BaseClass {
	@Test
	public void testValidatingPaypalPaymentMethods() {
		OnboardingPageWebElements ope = new OnboardingPageWebElements();
		ope.ClickOnSettingsLink();
		ope.ClickOnCompanySettingLink();
		AccountSettingsWebElements ase = new AccountSettingsWebElements();
		ase.ClickBillingLink();
		ase.ClickPaymentMethods();
		boolean PayPal;
		try {
			driver.findElement(By.xpath("//div[contains(text(),'sntl_b_1346057779_per@xpathy.org')]"));
			System.out.println(PayPal = true);
			System.out.println("Paypal details are saved");
		} catch (Exception e) {
			PayPal = false;
			System.out.println("PayPal details are not saved");
		}
	}
}
