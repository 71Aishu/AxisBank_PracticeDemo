package com.flipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class MobileConfig 
{
	WebDriver driver;
	
	public MobileConfig(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	// CheckBox Click
	
	@FindBy(xpath="//div[text() = 'SAMSUNG']")
	public WebElement sam;
	
	@FindBy(xpath ="//div[text() = 'APPLE']")
	public WebElement apple;
	
	@FindBy(xpath="//div[text() = 'realme']")
	public WebElement realme;
	
	// Text is visible or not
	
	@FindBy(xpath = "(//div[text() = 'SAMSUNG'])[1]")
	public WebElement sam2;
	
	@FindBy(xpath = "(//div[text() = 'APPLE'])[1]")
	public WebElement apple2;
	
	@FindBy(xpath = "(//div[text() = 'realme'])[1]")
	public WebElement realme2;
	
	// CheckBox Uncheck
	
	@FindBy(xpath = "(//div[text() = 'SAMSUNG'])[1]")
	public WebElement sam1;
	
	@FindBy(xpath = "(//div[text() = 'APPLE'])[1]")
	public WebElement apple1;
	
	@FindBy(xpath = "(//div[text() = 'realme'])[1]")
	public WebElement realme1;
	
	public void CheckboxClick() throws InterruptedException
	{
		sam.click();
		Thread.sleep(2000);
		apple.click();
		Thread.sleep(2000);
		realme.click();
	}
	
	public void VisibleText()
	{
		 System.out.println( sam2.isDisplayed());
    	 Assert.assertTrue(sam2.isDisplayed()," Samsung is not Displayed");
    	 
    	 System.out.println( apple2.isDisplayed());
    	 Assert.assertTrue(apple2.isDisplayed()," Apple is not Displayed");
    	 
    	 System.out.println( realme2.isDisplayed());
    	 Assert.assertTrue(realme2.isDisplayed()," Realme is not Displayed");
	}
	public void CheckBoxUncheck() throws InterruptedException
	{
		sam1.click();
		Thread.sleep(2000);
		apple1.click();
		Thread.sleep(2000);
		realme1.click();
	
	}
}
