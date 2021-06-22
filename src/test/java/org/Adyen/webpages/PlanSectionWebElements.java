package org.Adyen.webpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.Adyen.utilities.BaseClass;

public class PlanSectionWebElements {
	@FindBy(xpath = "//button[contains(text(),'Change plan')]")
	private WebElement Changeplan;

	@FindBy(xpath = "//button[contains(text(),'Choose Premium')]")
	private WebElement PremiumLink;

	@FindBy(xpath="//button[contains(text(),'Proceed to checkout')]")
	private WebElement  ProceedToCheckOutButton;
	
	@FindBy(xpath="//button[contains(text(),'Confirm and pay')]")
	private WebElement ConfirmAndPay;
	
	@FindBy(xpath="//button[contains(text(),'Go to numbers list')]")
	private WebElement GoToNumbersList;
	
	@FindBy(xpath="//button[contains(text(),'Close')]")
	private WebElement CloseButton;
	public PlanSectionWebElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}

	public void ClickChangePlanLink() {
		BaseClass.log.info(".....clicked on Change Plan Link.....");
		Changeplan.click();
	}

	public void ClickOnPremiumLink() {
		BaseClass.log.info(".....clicked on Premium Link.....");
		PremiumLink.click();
	}
	
	public void ClickOnProceedToCheckOutButton()
	{
		BaseClass.log.info(".....clicked on Proceed To checkout Link.....");
		ProceedToCheckOutButton.click();
	}
	
	public void ClickOnConfirmAndPayButton()
	{
		BaseClass.log.info(".....clicked on Confirm and Pay now Link.....");
		ConfirmAndPay.click();
	}
	
	public void ClickOnCloseButon()
	{
		BaseClass.log.info(".....clicked on Close Button.....");
		CloseButton.click();
	}
	
	public void NavigateToNumbersList()
	{
		BaseClass.log.info(".....Navigated To Numbers List.....");
		GoToNumbersList.click();
	}
}
