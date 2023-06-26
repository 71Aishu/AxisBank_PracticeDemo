package com.Axis.PageObjects.Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenuConfig 
{
    WebDriver driver;
	
	public MenuConfig(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
      @FindBy(id="nav-hamburger-menu")
      public WebElement AllButton;
      
      @FindBy(xpath="//*[text()='Mobiles, Computers']")
      public WebElement mobcom;
      
      @FindBy(xpath="//*[text()='All Mobile Phones']")
      public WebElement allmob;
      
      public void clickButton()
      {
    	  AllButton.click();
    	  mobcom.click();
    	  allmob.click();
      }
}
