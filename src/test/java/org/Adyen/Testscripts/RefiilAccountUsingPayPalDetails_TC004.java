package org.Adyen.Testscripts;

import java.io.IOException;

import org.Adyen.utilities.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.Adyen.webpages.AccountSettingsWebElements;
import org.Adyen.webpages.OnboardingPageWebElements;
import org.Adyen.webpages.PaypalPageWebElements;
import org.Adyen.webpages.PrepaidAccountPageWebElements;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

public class RefiilAccountUsingPayPalDetails_TC004 extends BaseClass {
	@Test
	public void testRefiilAccountUsingPayPalDetails_TC004()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
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
		pawe.ClickPaypalButton();
		Thread.sleep(2000);
		driver.findElement(
				By.xpath("//div[contains(text(),'Payment method')]/following::button[contains(text(),'Refill')]"))
				.click();
		Thread.sleep(2000);
		PaypalPageWebElements pcce = new PaypalPageWebElements();
		Thread.sleep(2000);
		pcce.EnterEmailId();
		Thread.sleep(2000);
		pcce.ClickNextButton();
		Thread.sleep(2000);
		pcce.EnterPassword();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'Accept Cookies')]")).click();
		Thread.sleep(2000);
		pcce.ClickLoginButton();
		Thread.sleep(5000);
		Actions a1 = new Actions(driver);
		a1.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(2000);
		pcce.ClickAgreeAndPayNowButton();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//div[@class='_3nn-c2zVDVs0WGOxisscC3']")).getText());
		Thread.sleep(2000);
		pawe.Closepopup();
	}
}
