package org.Adyen.Testscripts;

import org.Adyen.utilities.BaseClass;
import org.Adyen.webpages.AccountSettingsWebElements;
import org.Adyen.webpages.OnboardingPageWebElements;
import org.Adyen.webpages.PaymentsMethodsSectionWebElements;
import org.testng.annotations.Test;

public class DeleteSavedGpayMethodUnderPaymentMethodsSection_TC0011 extends BaseClass {
	@Test
	public void testDeleteSavedGpayMethodUnerPaymentMethodsSection_TC0011() throws InterruptedException {
		OnboardingPageWebElements ope = new OnboardingPageWebElements();
		ope.ClickOnSettingsLink();
		ope.ClickOnCompanySettingLink();
		AccountSettingsWebElements ase = new AccountSettingsWebElements();
		ase.ClickBillingLink();
		AccountSettingsWebElements asw = new AccountSettingsWebElements();
		asw.ClickPaymentMethods();
		PaymentsMethodsSectionWebElements pmsw = new PaymentsMethodsSectionWebElements();
		pmsw.ClickOnGPayOptionsLink();
		Thread.sleep(2000);
		pmsw.ClickOnDeleteIcon();
		Thread.sleep(3000);
		pmsw.ClickDeleteButton();
		Thread.sleep(5000);
	}
}
