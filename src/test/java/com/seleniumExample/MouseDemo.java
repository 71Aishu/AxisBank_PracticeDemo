package com.seleniumExample;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseDemo
{
	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver", "E:\\eclipse\\ChromeDriver\\chromedriver.exe");
     	WebDriver driver = new ChromeDriver();
     	
     	driver.get("https://www.amazon.in/");
     	driver.manage().window().maximize();
     	Thread.sleep(1000);

     	Actions act = new Actions(driver);
     	act.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();
     	Thread.sleep(2000);
     	act.contextClick(driver.findElement(By.xpath("(//*[text()='Your Account'])[2]"))).build().perform();
     	driver.quit();
	}

}
