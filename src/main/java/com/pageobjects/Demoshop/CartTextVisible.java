package com.pageobjects.Demoshop;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class CartTextVisible 
{
	WebDriver driver;
	
	public CartTextVisible(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	} 
	
	@FindBy(xpath="//*[@id='add-to-cart-button-72']")
	public WebElement cartButton;
	
	public void VisibleCartButton()
	{
		System.out.println(cartButton.isDisplayed());
		Assert.assertTrue(cartButton.isDisplayed(), "Add To Cart Button is not enabled ");
	}
}
