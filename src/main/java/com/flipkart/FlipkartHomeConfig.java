package com.flipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartHomeConfig 
{
WebDriver driver;
	
	public FlipkartHomeConfig(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	} 
     
	  @FindBy(xpath="//*[text()='✕']")
	  public WebElement Cross;
	  
     @FindBy(xpath="(//*[text() = 'Mobiles'])[1]")
     public WebElement mob;
     
     public void pop()
     {
    	 Cross.click();
     }
     public void ClickOnMob()
     {
    	 mob.click();
     }
}
