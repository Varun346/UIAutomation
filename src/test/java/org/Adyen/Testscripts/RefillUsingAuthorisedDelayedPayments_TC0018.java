package org.Adyen.Testscripts;

import org.Adyen.utilities.BaseClass;
import org.Adyen.webpages.AccountSettingsWebElements;
import org.Adyen.webpages.AliPayHomePageWebElements;
import org.Adyen.webpages.OnboardingPageWebElements;
import org.Adyen.webpages.PaymentsMethodsSectionWebElements;
import org.Adyen.webpages.PrepaidAccountPageWebElements;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class RefillUsingAuthorisedDelayedPayments_TC0018 extends BaseClass{
	@Test
	public void testRefillUsingAuthorisedDelayedPayments_TC0018() throws InterruptedException
	{
		OnboardingPageWebElements ope = new OnboardingPageWebElements();
		ope.ClickOnSettingsLink();
		ope.ClickOnCompanySettingLink();
		AccountSettingsWebElements ase = new AccountSettingsWebElements();
		ase.ClickBillingLink();
		String walletbalance=driver.findElement(By.xpath("//div[contains(@class,'_1ft1R7jG7SVG1nbl0XfEE6')]")).getText();
		System.out.println(walletbalance);
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
		Thread.sleep(2000);
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
		ase.ClickPaymentMethods();
		Thread.sleep(2000);
		ase.ClickPrepaidAccountLink();
		BaseClass.driver.navigate().refresh();
		String currentbalance=driver.findElement(By.xpath("//div[contains(@class,'_1ft1R7jG7SVG1nbl0XfEE6')]")).getText();
		System.out.println(currentbalance);
	}

}
