package com.MainFramework.Amazon;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import com.Axis.BaseamazonProject.BaseConfig;
import com.Axis.PageObjects.Amazon.HomePageConfig;
import com.Axis.PageObjects.Amazon.MenuConfig;
import com.Axis.PageObjects.Amazon.VisibleDemo;

public class MainTestCases extends BaseConfig
{
    // declaration of the page objects
	public HomePageConfig homeobj;
	public MenuConfig menuobj;
	public VisibleDemo Visiobj;
	WebDriver driver;
	
	// Gave the memory to pageobjects
	
	@BeforeClass
	public void InitialiSetup()
	{
		homeobj = new HomePageConfig(driver);
		menuobj = new MenuConfig(driver);
		Visiobj = new VisibleDemo(driver); 
	}
	
	// TestCases
	public void scenario()
	{
		homeobj.verifySignInButton();
		menuobj.clickButton();
		Visiobj.visibleTex();
		
	}
}
