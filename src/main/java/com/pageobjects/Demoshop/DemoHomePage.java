package com.pageobjects.Demoshop;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class DemoHomePage
{
WebDriver driver;
	
	public DemoHomePage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}   
	@FindBy(xpath="//img[@alt='Tricentis Demo Web Shop']")
	public WebElement DemoshopButton;
	
	@FindBy(xpath="//*[text()='Register']")
	public WebElement register;
	
	@FindBy(xpath="//*[text()='Log in']")
	public WebElement login;
	
	@FindBy(xpath="(//*[text()='Shopping cart'])[1]")
	public WebElement shoppingcart;
	
	@FindBy(xpath="(//*[text()='Wishlist'])[1]")
	public WebElement wishlist;
	
	public void buttonsVisible()
	{
		 System.out.println(DemoshopButton.isDisplayed());
    	 Assert.assertTrue(DemoshopButton.isDisplayed(),"Demoshop Button is not Displayed");
    	 
		 System.out.println(register.isDisplayed());
    	 Assert.assertTrue(register.isDisplayed(),"Register Button is not Displayed");
    	 
    	 System.out.println(login.isDisplayed());
    	 Assert.assertTrue(login.isDisplayed(),"Log In Button is not Displayed");
    	 
    	 System.out.println(shoppingcart.isDisplayed());
    	 Assert.assertTrue(shoppingcart.isDisplayed(),"ShoppingCart Button is not Displayed");
    	 
    	 System.out.println(wishlist.isDisplayed());
    	 Assert.assertTrue(wishlist.isDisplayed(),"Wishlist Button is not Displayed");
	}
	
}
