package org.Adyen.Testscripts;

import org.Adyen.utilities.BaseClass;
import org.Adyen.webpages.AccountSettingsWebElements;
import org.Adyen.webpages.OnboardingPageWebElements;
import org.Adyen.webpages.PrepaidAccountPageWebElements;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class RefillAccountUsingSavedPayPalDetails_TC005 extends BaseClass
{
	@Test
	public void testRefillAccountUsingSavedPayPalDetails_TC005() throws InterruptedException
	{
		OnboardingPageWebElements ope = new OnboardingPageWebElements();
		ope.ClickOnSettingsLink();
		ope.ClickOnCompanySettingLink();
		AccountSettingsWebElements ase = new AccountSettingsWebElements();
		ase.ClickBillingLink();
		PrepaidAccountPageWebElements pawe = new PrepaidAccountPageWebElements();
		pawe.ClickRefillLink();
		driver.findElement(By.xpath("//span[@class='Select-value-label']/following::div[@class='Select-value']"))
				.click();
		driver.findElement(By.xpath("//*[contains(text(),'$10.00')]")).click();
		Thread.sleep(2000);
		pawe.ClickMasterCardLink();
		Thread.sleep(5000);
		pawe.ClickPayPalLink();
		pawe.clicksaveddetailsrefillButon();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//div[@class='_3nn-c2zVDVs0WGOxisscC3']")).getText());
		Thread.sleep(2000);
		pawe.Closepopup();
		Thread.sleep(2000);
		System.out.println(pawe.getCurrentBalance());
	}
}
