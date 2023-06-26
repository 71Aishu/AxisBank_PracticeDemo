package com.seleniumExample;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
public class SeleniumDemo 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\eclipse\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
         driver.get("https://www.myntra.com/");
	}

}
