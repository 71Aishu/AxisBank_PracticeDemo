package com.Axis.PageObjects.Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class VisibleDemo 
{
    WebDriver driver;
	
	public VisibleDemo(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this); // initialize the elements
	}
	
     @FindBy(xpath = "(//*[text()='Mobiles & Accessories'])[3]")
     public WebElement mobaccessories;
     
     public void visibleTex()
     {
    	 Assert.assertTrue(mobaccessories.isDisplayed(), "The Mobile and Accessories is displayed");
     }
}
