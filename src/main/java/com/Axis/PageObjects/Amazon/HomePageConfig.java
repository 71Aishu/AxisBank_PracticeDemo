package com.Axis.PageObjects.Amazon;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePageConfig 
{
	WebDriver driver;
	
	public HomePageConfig(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
     @FindBy(xpath="//a[contains(text(),'Sign in securely')]")
     public WebElement signInButton;
     
     public void verifySignInButton()
     {
    	 System.out.println(signInButton.isDisplayed());
    	 Assert.assertTrue(signInButton.isDisplayed(),"Sign In Button is not Displayed");
     }
}
