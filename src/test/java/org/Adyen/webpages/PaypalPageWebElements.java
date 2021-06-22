package org.Adyen.webpages;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.Adyen.utilities.BaseClass;
import org.Adyen.utilities.ExcelOperation;

public class PaypalPageWebElements {
	@FindBy(xpath = "//span[contains(text(),'Add debit or credit card')]")
	private WebElement AddDebitCreditCardLink;

	@FindBy(xpath = "//input[@id='email']")
	private WebElement EmailID;

	@FindBy(xpath = "//button[contains(text(),'Next')]")
	private WebElement NextButton;

	@FindBy(xpath = "//input[@id='password']")
	private WebElement PasswordField;

	@FindBy(id = "btnLogin")
	private WebElement LoginButton;

	@FindBy(xpath = "//input[@id='cardNumber']")
	private WebElement CreditCardNumber;

	@FindBy(xpath = "//input[@id='cardCvv']")
	private WebElement CVVNumber;

	@FindBy(xpath = "//button[contains(text(),'Save')]")
	private WebElement SaveButton;

	@FindBy(xpath = "//button[@id='payment-submit-btn']")
	private WebElement AgreeButton;

	@FindBy(xpath = "//div[contains(@class,'FundingInstrument_container_16IeJ')]")
	private WebElement PayWIth;

	@FindBy(xpath = "//h2[contains(text(),'Pay later')]/following::div[contains(@class,'css-16oh5wr-Container ee3mss70')]")
	private WebElement PayLater;

	public PaypalPageWebElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}

	public void ClickAddDebitCreditCardLink() {
		AddDebitCreditCardLink.click();
	}

	public void EnterEmailId() throws EncryptedDocumentException, InvalidFormatException, IOException {
		String email = ExcelOperation.Readdata("Sheet1", 6, 0);
		EmailID.sendKeys(email);
	}

	public void ClickNextButton() {
		NextButton.click();
	}

	public void EnterPassword() throws EncryptedDocumentException, InvalidFormatException, IOException {
		String pwd = ExcelOperation.Readdata("Sheet1", 6, 1);
		PasswordField.sendKeys(pwd);
	}

	public void ClickLoginButton() {
		LoginButton.click();
	}

	public void EnterCreditCardNumber() throws EncryptedDocumentException, InvalidFormatException, IOException {
		String num = ExcelOperation.Readdata("Sheet1", 1, 1);
		CreditCardNumber.sendKeys(num);
	}

	public void EnterCVVNumber() throws EncryptedDocumentException, InvalidFormatException, IOException {
		String cvv = ExcelOperation.Readdata("Sheet1", 1, 2);
		CVVNumber.sendKeys(cvv);
	}

	public void ClickSaveButton() {
		SaveButton.click();
	}

	public void ClickAgreeAndPayNowButton() {
		AgreeButton.click();
	}

	public void ClickOnPayWithRadioButton() {
		PayWIth.click();
	}

	public void ClickOnPayLaterRadioButton() {
		PayLater.click();
	}
}
