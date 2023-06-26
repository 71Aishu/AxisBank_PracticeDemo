package com.seleniumExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleDemo 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\eclipse\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	/*	driver.get("https://www.google.com/");
		driver.findElement(By.linkText("Gmail")).click();
		*/
		
		driver.get("https://www.calculator.net/calorie-calculator.html\"");
		driver.findElement(By.name("cage")).clear();
		driver.findElement(By.name("cage")).sendKeys("22");
		driver.findElement(By.xpath("//*[text()=' female']")).click();
		driver.findElement(By.name("cheightmeter")).clear();
		driver.findElement(By.name("cheightmeter")).sendKeys("198");
		driver.findElement(By.name("ckg")).clear();
		driver.findElement(By.name("ckg")).sendKeys("40");
		driver.findElement(By.xpath("(//*[@value='Calculate'])[1]")).click();
		
	}	
}
