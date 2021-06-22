package org.Adyen.webpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.Adyen.utilities.ExcelOperation;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import java.io.IOException;

import org.Adyen.utilities.BaseClass;

public class PrepaidAccountPageWebElements {
	@FindBy(xpath = "//button[contains(text(),'Refill')]")
	private WebElement RefillLink;

	@FindBy(xpath = "//span[contains(text(),'Google Pay')]")
	private WebElement PaymentMethod;

	@FindBy(xpath = "//span[contains(text(),'5125 **** **** 0006')]")
	private WebElement MasterCardPaymentLink;

	@FindBy(xpath = "//span[contains(text(),'add payment method')]")
	private WebElement AddPaymentMethodLink;

	@FindBy(xpath = "//span[contains(text(),'sntl_b_1346057779_per@xpathy.org')]")
	private WebElement PayPalLink;

	@FindBy(xpath = "//span[contains(text(),'add payment method')]/following::button[contains(text(),'Refill')]")
	private WebElement Refill;

	@FindBy(xpath = "//button[contains(text(),'add payment method')]")
	private WebElement AddPaymentMethod;

	@FindBy(xpath = "//*[@id='root']/div/div[2]/article/div/div[2]/div/div/div/div/div[1]/button")
	private WebElement CreditCardMasterCard;

	@FindBy(xpath = "//input[@placeholder='John Doe']")
	private WebElement Name;

	@FindBy(xpath = "//input[@placeholder='xxxx xxxx xxxx xxxx']")
	private WebElement CardNumber;

	@FindBy(xpath = "//input[@placeholder='xxx']")
	private WebElement SecurityCode;

	@FindBy(xpath = "//button[@class='gpay-button white short en']")
	private WebElement GpayLink;

	@FindBy(xpath = "//*[@class='_3c4lVimQDUJbFGqsIakD-4'][2]/button")
	private WebElement PaypalLink;

	@FindBy(xpath = "//*[@id='92']")
	private WebElement ExpiryDate;

	@FindBy(xpath = "//button[contains(text(),'Add')]")
	private WebElement AddButton;

	@FindBy(xpath = "//button[contains(text(),'Close')]")
	private WebElement Close;

	@FindBy(xpath = "//div[@class='_1n_O2J5KwAR_e9B6CG5_uN']")
	private WebElement Currentbalance;

	@FindBy(xpath = "//div[contains(text(),'Payment method')]/following::button[contains(text(),'Refill')]")
	private WebElement Savedrefillbutton;

	public PrepaidAccountPageWebElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}

	public void ClickRefillLink() {

		BaseClass.log.info(".....clicked on Refill Link.....");
		RefillLink.click();
	}

	public void clickonPaymentMethod() {
		PaymentMethod.click();
	}

	public void ClickAddPayementLink() {
		AddPaymentMethodLink.click();
	}

	public void ClickMasterCardLink() {
		MasterCardPaymentLink.click();
	}

	public void ClickPayPalLink() {
		PayPalLink.click();
	}

	public void ClickRefill() {
		Refill.click();
	}

	public void ClickAddPaymentMethod() {
		BaseClass.log.info(".....clicked on Add Payment method Link.....");
		AddPaymentMethod.click();
	}

	public void ClickCreditCardMasterCardLink() {
		BaseClass.log.info(".....clicked on Creditcard/MasterCard Link.....");
		CreditCardMasterCard.click();
	}

	public void EnterCardHolderName() throws EncryptedDocumentException, InvalidFormatException, IOException {
		BaseClass.log.info(".....Entered Card holder name.....");
		String name = ExcelOperation.Readdata("Sheet1", 1, 0);
		Name.sendKeys(name);
	}

	public void EnterCardNumber() throws EncryptedDocumentException, InvalidFormatException, IOException {
		BaseClass.log.info(".....Entered Card Number.....");
		String cardnumber = ExcelOperation.Readdata("Sheet1", 1, 1);
		CardNumber.sendKeys(cardnumber);
	}

	public void EnterCvcCode() throws EncryptedDocumentException, InvalidFormatException, IOException {
		BaseClass.log.info(".....Entered security code.....");
		String cvc = ExcelOperation.Readdata("Sheet1", 1, 2);
		SecurityCode.sendKeys(cvc);
	}

	public void EnterExpiryDate()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BaseClass.log.info(".....Entered Date.....");
		ExpiryDate.click();
		Thread.sleep(2000);
		String date = ExcelOperation.Readdata("Sheet1", 1, 2);
		ExpiryDate.sendKeys(date);
	}

	public void ClickAddButton() {
		BaseClass.log.info(".....clicked on Add button.....");
		AddButton.click();
	}

	public void Closepopup() {
		BaseClass.log.info(".....clicked on close link under pop-up.....");
		Close.click();
	}

	public String getCurrentBalance() {
		BaseClass.log.info(".....Getting the current balance.....");
		String bal = Currentbalance.getText();
		return bal;

	}

	public void clicksaveddetailsrefillButon() {
		BaseClass.log.info(".....clicked under Saved details refill Link.....");
		Savedrefillbutton.click();
	}

	public void ClickPaypalButton() {
		BaseClass.log.info(".....clicked PayPal Link.....");
		PaypalLink.click();
	}
}
