package org.Adyen.webpages;

import org.Adyen.utilities.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentsMethodsSectionWebElements {
	@FindBy(xpath = "//div[contains(text(),'Google Pay')]")
	private WebElement GooglePay;

	@FindBy(xpath = "//button[contains(@id,'adyenpay-containeralipay')]")
	private WebElement AliPay;

	@FindBy(xpath = "//div[contains(text(),'Google Pay')]/following::div[2]")
	private WebElement GooglePayOptionsLink;

	@FindBy(xpath = "//div[contains(text(),'5125 XXXX XXXX 0006')]")
	private WebElement MasterCard;

	@FindBy(xpath = "//div[contains(text(),'5125 XXXX XXXX 0006')]/following::div[2]")
	private WebElement MasterCardOptionsLink;

	@FindBy(xpath = "//div[contains(text(),'sntl_b_1346057779_per@xpathy.org')]")
	private WebElement PayPal;

	@FindBy(xpath = "//div[contains(text(),'sntl_b_1346057779_per@xpathy.org')]/following::div[2]")
	private WebElement PaypalOptionsLink;

	@FindBy(xpath = "//div[contains(text(),'Delete')]")
	private WebElement DeleteIcon;

	@FindBy(xpath = "//div[contains(text(),'Make primary')]")
	private WebElement PrimaryIcon;

	@FindBy(xpath = "//button[contains(text(),'Delete')]")
	private WebElement DeleteButton;

	public PaymentsMethodsSectionWebElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}

	public void ClickOnGPayOptionsLink() {
		GooglePayOptionsLink.click();
		BaseClass.log.info(".....Clicked on Option link......");
	}
	
	public void ClickOnAlipayLink()
	{
		AliPay.click();
		BaseClass.log.info(".......Clicked on AliPay Button.......");
	}

	public void ClickOnMasterCardOptionsLink() {
		MasterCardOptionsLink.click();
	}

	public void ClickOnPayPalOptionsLink() {
		PaypalOptionsLink.click();
	}

	public void ClickOnPrimaryIcon() {
		PrimaryIcon.click();
		BaseClass.log.info(".....Clicked on primary icon link......");
	}

	public void ClickOnDeleteIcon() {
		DeleteIcon.click();
		BaseClass.log.info(".....Clicked on delete icon link......");
	}

	public void ClickDeleteButton() {
		DeleteButton.click();
		BaseClass.log.info(".....Clicked on delete button......");
	}
}
