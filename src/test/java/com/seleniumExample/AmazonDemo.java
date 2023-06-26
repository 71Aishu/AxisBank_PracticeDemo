package com.seleniumExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonDemo 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\eclipse\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("nav-hamburger-menu")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//*[@id='nav-link-accountList']")).click();
		driver.findElement(By.xpath("(//*[text()='Your Account'])[2]")).click();
        
		driver.quit();
	}

}
