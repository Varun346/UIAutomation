package org.Adyen.Testscripts;

import org.Adyen.utilities.BaseClass;
import org.Adyen.webpages.AccountSettingsWebElements;
import org.Adyen.webpages.OnboardingPageWebElements;
import org.Adyen.webpages.PlanSectionWebElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ConvertingAccountFromFreeToPremium_TC0014 extends BaseClass {
	@Test
	public void testConvertingAccountFromFreeToPremium_TC0014() throws InterruptedException {
		OnboardingPageWebElements ope = new OnboardingPageWebElements();
		ope.ClickOnSettingsLink();
		Thread.sleep(2000);
		ope.ClickOnCompanySettingLink();
		Thread.sleep(2000);
		AccountSettingsWebElements aswe = new AccountSettingsWebElements();
		aswe.ClickBillingLink();
		Thread.sleep(2000);
		aswe.ClickPlanLink();
		PlanSectionWebElements pswe = new PlanSectionWebElements();
		pswe.ClickChangePlanLink();
		Thread.sleep(2000);
		pswe.ClickOnPremiumLink();
		Thread.sleep(5000);
		pswe.ClickOnConfirmAndPayButton();
		Thread.sleep(2000);
		WebElement conformation = driver.findElement(By.xpath("//div[contains(@class,'_2D7kLBR9gPH_c4D2hAZGCw')]"));
		System.out.println(conformation);
		Thread.sleep(2000);
		pswe.NavigateToNumbersList();
		
	}
}
