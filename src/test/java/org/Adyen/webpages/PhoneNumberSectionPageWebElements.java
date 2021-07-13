package org.Adyen.webpages;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.Adyen.utilities.BaseClass;
import org.Adyen.utilities.ExcelOperation;

public class PhoneNumberSectionPageWebElements {

	@FindBy(xpath = "//button[contains(@class,'k2Vfi-pf6lID_dwdIg5k3  false _9sdTT7FSFJ_bcf9Yo6dWp false false false')]")
	private WebElement AddLink;

	@FindBy(xpath = "//input[@placeholder='Search for a place']")
	private WebElement searchCountry;

	@FindBy(xpath = "//input[@placeholder='Search for a place']")
	private WebElement EnterCountryName;

	@FindBy(xpath = "//input[@placeholder='Search for a place']")
	private WebElement EnteredRosarioCity;

	@FindBy(xpath = "//input[@placeholder='Search for a place']/following::div[contains(text(),'Rosario')]")
	private WebElement ClickonRosario;

	@FindBy(xpath = "//input[@placeholder='Search for a place']/following::div[contains(text(),'New Jersey')]")
	private WebElement ClickOnCountry;

	@FindBy(xpath = "//div[contains(text(),'Free with Premium')]")
	// @FindBy(xpath = "//div[contains(text(),'$1.99')]")
	private WebElement SelectPhoneNumber;

	@FindBy(xpath = "//span[contains(text(),'Free with Premium')]")
	// @FindBy(xpath="//span[contains(text(),'Free for website')]")
	private WebElement SubscriptionDropdown;

	@FindBy(xpath = "//button[@class='_2ctjkEMVpLOg7LFby6tR9c _2l9my-ZHlIwm8jrYhC-tBQ false dZWwbOu5nobbzntEscsqx false false false']")
	private WebElement AddToCart;

	@FindBy(xpath = "//a[contains(@href,'cart')]")
	private WebElement CartIcon;

	@FindBy(xpath = "//button[contains(text(),'Proceed to checkout')]")
	private WebElement ProceedToCheckOutButton;

	@FindBy(xpath = "//button[contains(text(),'Confirm and pay')]")
	private WebElement ConformAndPayButton;

	@FindBy(xpath = "//button[contains(text(),'Confirm and pay now')]")
	private WebElement ConfirmAndPayNowButton;

	public PhoneNumberSectionPageWebElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}

	public void ClickAddLink() {
		BaseClass.log.info(".....clicked on Add Link.....");
		AddLink.click();
	}

	public void ClickOnSearchBox() {
		BaseClass.log.info(".....clicked On search country.....");
		searchCountry.click();
	}

	public void EnterCountryName() throws EncryptedDocumentException, InvalidFormatException, IOException {
		String country = ExcelOperation.Readdata("Sheet1", 9, 0);
		EnterCountryName.sendKeys(country);
		BaseClass.log.info(".....Entered country Name.....");
	}

	public void EnterCityName() throws EncryptedDocumentException, InvalidFormatException, IOException {
		String country = ExcelOperation.Readdata("Sheet1", 12, 0);
		EnteredRosarioCity.sendKeys(country);
		BaseClass.log.info(".....Entered Rosario City Name.....");
	}

	public void ClickOnCityName() {
		ClickonRosario.click();
		BaseClass.log.info(".....Clicked On City.....");
	}

	public void ClickOnCountryName() {
		ClickOnCountry.click();
		BaseClass.log.info(".....Clicked On Country Name.....");
	}

	public void SelectPhoneNumber() throws InterruptedException {
		SelectPhoneNumber.click();
		BaseClass.log.info(".....Selected phone Number.....");
	}

	public void ClickOnSubscriptionDropdown() {
		SubscriptionDropdown.click();
	}

	public void ClickOnAddToCart() {
		AddToCart.click();
		BaseClass.log.info(".....Clicked on Add to cart.....");
	}

	public void ClickOnCartIcon() {
		CartIcon.click();
		BaseClass.log.info(".....Clicked on Cart Icon.....");
	}

	public void ClickOnProceedToCheckOutButton() {
		ProceedToCheckOutButton.click();
		BaseClass.log.info(".....Clicked on Proceed to checkout button.....");
	}

	public void ClickOnConfirmAndPayNowButton() {
		ConfirmAndPayNowButton.click();
		BaseClass.log.info(".....Clicked on Confirm and Pay now button.....");
	}

	public void ClickOnConformAndPayButton() {
		ConformAndPayButton.click();
		BaseClass.log.info(".....Clicked on Conform and Pay button.....");
	}
}
