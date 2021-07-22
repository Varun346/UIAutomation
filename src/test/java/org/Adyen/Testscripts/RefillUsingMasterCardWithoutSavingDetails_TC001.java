package org.Adyen.Testscripts;

import java.io.IOException;

import org.Adyen.utilities.BaseClass;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.Adyen.webpages.AccountSettingsWebElements;
import org.Adyen.webpages.OnboardingPageWebElements;
import org.Adyen.webpages.PrepaidAccountPageWebElements;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

public class RefillUsingMasterCardWithoutSavingDetails_TC001 extends BaseClass {
	@Test
	public void testRefillUsingMasterCardWithoutSavingDetails_TC001()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
		OnboardingPageWebElements ope = new OnboardingPageWebElements();
		ope.ClickOnSettingsLink();
		ope.ClickOnCompanySettingLink();
		AccountSettingsWebElements ase = new AccountSettingsWebElements();
		ase.ClickBillingLink();
		PrepaidAccountPageWebElements pawe = new PrepaidAccountPageWebElements();
		pawe.ClickRefillLink();
		Thread.sleep(2000);
		pawe.clickonPaymentMethod();
		Thread.sleep(2000);
		pawe.ClickAddPayementLink();
		Thread.sleep(2000);
		pawe.ClickRefill();
		Thread.sleep(2000);
		pawe.ClickCreditCardMasterCardLink();
		Thread.sleep(2000);
		pawe.EnterCardHolderName();
		Thread.sleep(2000);
		pawe.EnterCardNumber();
		Thread.sleep(2000);
		pawe.EnterCvcCode();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='xxx']/following::input[1]")).click();
		driver.findElement(By.xpath("//input[@placeholder='xxx']/following::input[1]")).sendKeys("06/28");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'Save payment method')]")).click();
		Thread.sleep(2000);
		pawe.ClickAddButton();
		Thread.sleep(5000);
		driver.findElement(
				By.xpath("//div[contains(text(),'Payment method')]/following::button[contains(text(),'Refill')]"))
				.click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//div[contains(text(),'Validation OK')]")).getText());
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'Yes (Y)')]")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//div[@class='_3nn-c2zVDVs0WGOxisscC3']")).getText());
		Thread.sleep(2000);
		pawe.Closepopup();
		Thread.sleep(2000);
		System.out.println(pawe.getCurrentBalance());
		Thread.sleep(4000);
	}
}
