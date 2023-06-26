package com.seleniumExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GuruDemo 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\eclipse\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/radio.html");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@value='Option 1']")).click();
		driver.findElement(By.xpath("//*[@value='checkbox1']")).click();

	}

}
