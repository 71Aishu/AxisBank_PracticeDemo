package com.pageobjects.Demoshop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoHomePageClick
{
  WebDriver driver;
  Actions act;
	
	public DemoHomePageClick(WebDriver driver)
	{
		this.driver = driver;
		this.act = new Actions(driver);
		PageFactory.initElements(driver,this);
	} 
	
	@FindBy(xpath="(//a[contains(text(),'Computers')])[1]")
	public WebElement computer;
   
	
	@FindBy(xpath="(//a[contains(text(),'Desktops')])[1]")
	public WebElement desktops;
	
	public void ClickOnButton()
	{
	   act.moveToElement(computer).build().perform();
		desktops.click();
	}
}
