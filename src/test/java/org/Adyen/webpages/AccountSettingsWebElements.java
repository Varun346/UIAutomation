package org.Adyen.webpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.Adyen.utilities.BaseClass;

public class AccountSettingsWebElements {
	@FindBy(xpath = "//button[contains(text(),'Billing')]")
	private WebElement BillingLink;

	@FindBy(linkText = "Payment methods")
	private WebElement Paymentmethods;

	@FindBy(linkText = "Plan")
	private WebElement PlanLink;

	@FindBy(linkText = "Receipts")
	private WebElement ReceiptsLink;

	@FindBy(xpath = "//button[contains(text(),'Telephony')]")
	private WebElement TelephonyLink;

	public AccountSettingsWebElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}

	public void ClickBillingLink() {
		BaseClass.log.info(".....clicked on Billings section.....");
		BillingLink.click();
	}

	public void ClickTelephonyLink() {
		BaseClass.log.info(".....clicked on Telephony section.....");
		TelephonyLink.click();
	}

	public void ClickPaymentMethods() {
		BaseClass.log.info(".....clicked on Payment methods section.....");
		Paymentmethods.click();
	}

	public void ClickPlanLink() {
		BaseClass.log.info(".....clicked on Plan section.....");
		PlanLink.click();
	}

	public void ClickReceiptsLink() {
		BaseClass.log.info(".....clicked on receipts section.....");
		ReceiptsLink.click();
	}
}
