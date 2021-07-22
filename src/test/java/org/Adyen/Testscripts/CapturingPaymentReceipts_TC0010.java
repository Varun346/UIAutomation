package org.Adyen.Testscripts;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.Adyen.utilities.BaseClass;
import org.Adyen.webpages.AccountSettingsWebElements;
import org.Adyen.webpages.OnboardingPageWebElements;
import org.testng.annotations.Test;

public class CapturingPaymentReceipts_TC0010 extends BaseClass {
	@Test
	public void testCapturingPaymentReceipts_TC0010() throws InterruptedException {
		OnboardingPageWebElements ope = new OnboardingPageWebElements();
		ope.ClickOnSettingsLink();
		ope.ClickOnCompanySettingLink();
		AccountSettingsWebElements ase = new AccountSettingsWebElements();
		ase.ClickBillingLink();
		ase.ClickReceiptsLink();
		Actions a1 = new Actions(driver);
		a1.sendKeys(Keys.PAGE_DOWN).perform();
		String s = new SimpleDateFormat("YYYYMMDDHHmmss").format(new Date());
		System.out.println(s);
		Thread.sleep(5000);
		EventFiringWebDriver rv1 = new EventFiringWebDriver(BaseClass.driver);
		File f1 = rv1.getScreenshotAs(OutputType.FILE);
		File f2 = new File(System.getProperty("user.dir") + "/Receipts/" + s + ".jpg");
		try {
			FileUtils.copyFile(f1, f2);
		} catch (IOException e) {
			e.printStackTrace();
		}
		Thread.sleep(2000);
	}
}
