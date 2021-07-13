package org.Adyen.webpages;

import org.Adyen.utilities.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AliPayHomePageWebElements 
{
	@FindBy(xpath="//button[contains(text(),'authorised')]")
	public WebElement AuthorisedButton;
	
	@FindBy(xpath="//button[contains(text(),'error')]")
	public WebElement ErrorButton;
	
	@FindBy(xpath="//button[contains(text(),'refused')]")
	public WebElement RefusedButton;
	
	@FindBy(xpath="//button[@id='pendingauthorisedBtnId']")
	public WebElement PendingAuthorisedButton;
	
	@FindBy(xpath="//button[@id='pendingrefusedBtnId']")
	public WebElement PendingRefusedButton;
	
	public AliPayHomePageWebElements()
	{
		PageFactory.initElements(BaseClass.driver,this);
	}
	
	public void ClickAuthorisedButton()
	{
		AuthorisedButton.click();
		BaseClass.log.info("....Clicked on Authorised Button.....");
	}
	
	public void ClickErrorButton()
	{
		ErrorButton.click();
		BaseClass.log.info("....Clicked on Error Button.....");
	}
	
	public void ClickRefusedButton()
	{
		RefusedButton.click();
		BaseClass.log.info("....Clicked on Refused Button.....");
	}
	
	public void ClickPendingAuthorisedButton()
	{
		WebElement w1 = BaseClass.driver.findElement(By.xpath("//button[contains(@id,'pendingauthorisedBtnId')]/following::select[1]"));
		Select s=new Select(w1);
		s.selectByIndex(0);
		BaseClass.log.info("....Selected time from dropdown.....");
		PendingAuthorisedButton.click();
		BaseClass.log.info("....Clicked on Pending Authorised Button.....");
	}
	
	public void ClickPendingRefusedButton()
	{
		WebElement w2 = BaseClass.driver.findElement(By.xpath("//button[contains(@id,'pendingauthorisedBtnId')]/following::select[2]"));
		Select s=new Select(w2);
		s.selectByIndex(0);
		BaseClass.log.info("....Selected time from dropdown.....");
		PendingRefusedButton.click();
		BaseClass.log.info("....Clicked on Pending Refused Button.....");
	}
}
