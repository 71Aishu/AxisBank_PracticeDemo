package com.seleniumExample;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;

public class DropDownDemo 
{

	public static void main(String[] args) throws InterruptedException 
	{
    	System.setProperty("webdriver.chrome.driver", "E:\\eclipse\\ChromeDriver\\chromedriver.exe");
     	WebDriver driver = new ChromeDriver();
     	
     	driver.get("https://demo.guru99.com/test/newtours/register.php");
     	driver.manage().window().maximize();
     	Thread.sleep(1000);
     	
     	Select sel = new Select(driver.findElement(By.name("country")));
     	
     	sel.selectByValue("AMERICAN SAMOA");
     	Thread.sleep(2000);
     	sel.selectByVisibleText("BAHAMAS");
     	
     	Thread.sleep(6000);
     	driver.quit();
	} 	
}
