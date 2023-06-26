package com.seleniumExample;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDemo1
{
	public static void main(String[] args) 
	{
		// System.setProperty("webdriver.gecko.driver", "E:\\eclipse\\GeckoDriver\\geckodriver.exe");
		// WebDriver driver = new FirefoxDriver();
		
		System.setProperty("webdriver.edge.driver", "E:\\eclipse\\EdgeDriver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
         driver.get("https://www.saucedemo.com/");
         driver.manage().window().maximize();
	}
}
