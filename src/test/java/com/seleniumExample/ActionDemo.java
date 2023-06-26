package com.seleniumExample;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDemo 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\eclipse\\ChromeDriver\\chromedriver.exe");
     	WebDriver driver = new ChromeDriver();
     	
     	driver.get("https://demo.guru99.com/test/drag_drop.html");
     	driver.manage().window().maximize();
     	Thread.sleep(1000);
     	Actions act = new Actions(driver);
     	
     	WebElement src = driver.findElement(By.xpath("//a[contains(text(),' 5000 ')]"));
     	WebElement dest = driver.findElement(By.id("amt8"));
     	
     	act.dragAndDrop(src, dest).build().perform();
     	driver.quit();
	}

}
