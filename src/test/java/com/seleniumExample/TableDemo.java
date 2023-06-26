package com.seleniumExample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableDemo 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\eclipse\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.nseindia.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		System.out.println(driver.findElement(By.xpath("//*[@id='tab1Loser']/tbody/tr[2]/td[1]")).getText());
		System.out.println(driver.findElement(By.xpath("//*[@id='tab1Loser']/tbody/tr[3]/td[2]")).getText());
 
		Thread.sleep(1000);
		driver.quit();
		
	}

}
