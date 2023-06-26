package com.pageobjects.Demoshop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoShopDesktop 
{
	 WebDriver driver;
		
		public DemoShopDesktop(WebDriver driver)
		{
			this.driver = driver;
			PageFactory.initElements(driver,this);
		} 
		
		@FindBy(xpath="(//*[@value='Add to cart'])[1]")
		public WebElement addtocart;
		
		public void ClickonCart()
		{
			addtocart.click();
		}
}
