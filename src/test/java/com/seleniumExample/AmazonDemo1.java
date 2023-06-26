package com.seleniumExample;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonDemo1 
{
	public static void main(String[] args) throws InterruptedException
	{
		// 1. Launch the amazon Website
		
		System.setProperty("webdriver.chrome.driver", "E:\\eclipse\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		// 2. Verify that sign in button is visible

		WebElement wd = driver.findElement(By.xpath("//a[contains(text(),'Sign in securely')]"));
     	if(wd.isDisplayed())
     	{
     		System.out.println("The Sign in Button is enabled : " +wd.isDisplayed());
     	}
     	else
     	{
     		System.out.println("The Sign in Button is not enabled. Return: " +wd.isDisplayed());
     	}
		
     	// 3. Click on hamburger menu icon
     	
     	driver.findElement(By.id("nav-hamburger-menu")).click();
		
     	// 4. Click on Mobile,Computer
     	
     	driver.findElement(By.xpath("//*[text()='Mobiles, Computers']")).click();
		
     	// 5. Click on All Mobile Phones
     	
     	driver.findElement(By.xpath("//*[text()='All Mobile Phones']")).click();
	
     	// 	6. Verify the header Mobiles & Accessories is visible
     	
     	WebElement wd1 = driver.findElement(By.xpath("(//*[text()='Mobiles & Accessories'])[3]"));
     	if(wd1.isDisplayed())
     	{
     		System.out.println("The Mobiles and Accessories is enabled : " +wd1.isDisplayed());
     	}
     	else
     	{
     		System.out.println("The Mobiles and Accessories is not enabled. Return: " +wd1.isDisplayed());
     	}

     	driver.quit();
	}

}
