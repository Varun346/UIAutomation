package org.Adyen.webpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.Adyen.utilities.BaseClass;

public class OnboardingPageWebElements {
	@FindBy(xpath = "(//div[contains(@class,'1R6RzeGBKgpu7PjhkbUDBM ')]/button)[1]")
	private WebElement SettingsLink;

	@FindBy(xpath = "//a[contains(text(),'Company settings')]")
	private WebElement CompanySettingsLink;
	@FindBy(xpath="//button[contains(text(),'Sign out')]")
	private WebElement LogOutLink;
	public OnboardingPageWebElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}

	public void ClickOnSettingsLink() {
		BaseClass.log.info(".....clicked on Settings Link.....");
		SettingsLink.click();
	}

	public void ClickOnCompanySettingLink() {
		BaseClass.log.info(".....clicked on Company settings Link.....");
		CompanySettingsLink.click();
	}
	public void ClickLogOutLink()
	{
		LogOutLink.click();
	}
}
