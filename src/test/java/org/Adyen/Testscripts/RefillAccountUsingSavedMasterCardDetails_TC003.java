package org.Adyen.Testscripts;

import org.openqa.selenium.By;
import org.Adyen.utilities.BaseClass;
import org.Adyen.webpages.AccountSettingsWebElements;
import org.Adyen.webpages.OnboardingPageWebElements;
import org.Adyen.webpages.PrepaidAccountPageWebElements;
import org.testng.annotations.Test;

public class RefillAccountUsingSavedMasterCardDetails_TC003 extends BaseClass {
	@Test
	public void testRefillAccountUsingSavedMasterCardDetails_TC003() throws InterruptedException {
		OnboardingPageWebElements ope = new OnboardingPageWebElements();
		ope.ClickOnSettingsLink();
		ope.ClickOnCompanySettingLink();
		AccountSettingsWebElements ase = new AccountSettingsWebElements();
		ase.ClickBillingLink();
		PrepaidAccountPageWebElements pawe = new PrepaidAccountPageWebElements();
		pawe.ClickRefillLink();
		driver.findElement(By.xpath("//span[@class='Select-value-label']/following::div[@class='Select-value']"))
				.click();
		driver.findElement(By.xpath("//*[contains(text(),'$50.00')]")).click();
		pawe.clicksaveddetailsrefillButon();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//div[@class='_3nn-c2zVDVs0WGOxisscC3']")).getText());
		Thread.sleep(2000);
		pawe.Closepopup();
		Thread.sleep(2000);
		System.out.println(pawe.getCurrentBalance());
	}
}
