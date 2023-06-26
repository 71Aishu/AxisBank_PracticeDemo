package com.seleniumExample;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDemo 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "E:\\eclipse\\GeckoDriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
         driver.get("https://www.myntra.com/");
	}
}
