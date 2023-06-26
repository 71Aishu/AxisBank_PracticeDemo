package com.flipkartMainFramework;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.Axis.BaseFlipKartProject.FlipKartBaseConfig;
import com.Axis.BaseFlipKartProject.*;
import com.flipkart.FlipkartHomeConfig;
import com.flipkart.MobileConfig;

public class FlipKartTestCases extends FlipkartGrid
{
	// declaration of the page objects
	    
	    WebDriver driver;
	    public FlipkartHomeConfig home;
		public MobileConfig mobcon;
	
		
		// Gave the memory to pageobjects
		
		@BeforeMethod
		@Parameters({"Port"})
		public void InitialiSetup(String Port) throws MalformedURLException 
		{
		//	driver = getDriver();
			driver = setUpGrid(Port);
			home = new FlipkartHomeConfig(driver);
			mobcon = new MobileConfig(driver);
		}
		
		// 
        @Test
		public void caseScenario() throws InterruptedException
		{
        	home.pop();
			home.ClickOnMob();
			mobcon.CheckboxClick();
			mobcon.VisibleText();
			mobcon.CheckBoxUncheck();
			
		}
}
