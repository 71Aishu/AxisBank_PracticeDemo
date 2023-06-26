package com.seleniumExample;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandleDemo
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\eclipse\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        
        driver.findElement(By.linkText("Gmail")).sendKeys(Keys.chord(Keys.CONTROL , Keys.RETURN));
        
        String parent = driver.getWindowHandle();
        System.out.println(parent);
        
        Set<String> windowsId = driver.getWindowHandles();
        Iterator<String> it = windowsId.iterator();
        
        while (it.hasNext())
        {
        	String child = it.next();
        	if(!parent.equals(child))
        	{
        		driver.switchTo().window(child);
        	}
        }
        driver.findElement(By.xpath("//*[@data-action='sign in']")).click();
        driver.switchTo().window(parent);
        
        driver.quit();
	}

}
