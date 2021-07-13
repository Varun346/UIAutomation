package org.Adyen.Testscripts;

import org.Adyen.utilities.BaseClass;
import org.Adyen.webpages.AccountSettingsWebElements;
import org.Adyen.webpages.AliPayHomePageWebElements;
import org.Adyen.webpages.OnboardingPageWebElements;
import org.Adyen.webpages.PaymentsMethodsSectionWebElements;
import org.Adyen.webpages.PrepaidAccountPageWebElements;
import org.testng.annotations.Test;

public class RefillUsingAuthorisedAliPayPaymentMethod_TC0017 extends BaseClass {
	@Test
	public void testRefillUsingAuthorisedAliPayPaymentMethod_TC0017() throws InterruptedException {
		OnboardingPageWebElements ope = new OnboardingPageWebElements();
		ope.ClickOnSettingsLink();
		ope.ClickOnCompanySettingLink();
		AccountSettingsWebElements ase = new AccountSettingsWebElements();
		ase.ClickBillingLink();
		PrepaidAccountPageWebElements pawe = new PrepaidAccountPageWebElements();
		pawe.ClickRefillLink();
		Thread.sleep(2000);
		pawe.ClickMasterCardLink();
		Thread.sleep(2000);
		pawe.ClickAddPayementLink();
		Thread.sleep(2000);
		pawe.ClickRefill();
		Thread.sleep(2000);
		PaymentsMethodsSectionWebElements pmsw=new PaymentsMethodsSectionWebElements();
		pmsw.ClickOnAlipayLink();
		Thread.sleep(5000);
		AliPayHomePageWebElements aphpw=new AliPayHomePageWebElements();
		aphpw.ClickAuthorisedButton();
		Thread.sleep(5000);
		pawe.Closepopup();
		Thread.sleep(2000);
		System.out.println(pawe.getCurrentBalance());
		Thread.sleep(4000);
	}
}
