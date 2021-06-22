package org.Adyen.Testscripts;

import org.Adyen.utilities.BaseClass;
import org.Adyen.webpages.AccountSettingsWebElements;
import org.Adyen.webpages.OnboardingPageWebElements;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ValidatingSavedPaymentMethods_TC007 extends BaseClass {
	@Test(priority = 1)
	public void testValidatingMasterCardPaymentMethods() {
		OnboardingPageWebElements ope = new OnboardingPageWebElements();
		ope.ClickOnSettingsLink();
		ope.ClickOnCompanySettingLink();
		AccountSettingsWebElements ase = new AccountSettingsWebElements();
		ase.ClickBillingLink();
		ase.ClickPaymentMethods();
		boolean Mastercard;
		try {
			driver.findElement(By.xpath("//div[contains(text(),'sntl_b_1346057779_per@xpathy.org')]"));
			Mastercard = true;
			System.out.println("MasterCard details are saved");

		} catch (Exception e) {
			Mastercard = false;
			System.out.println("MasterCard details are not saved");
		}
	}

	@Test(priority = 2)
	public void testValidatingPaypalPaymentMethods() {
		driver.navigate().refresh();
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
