package com.seleniumExample;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\eclipse\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
         driver.get("https://www.facebook.com/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjg1NjEwNjU2LCJjYWxsc2l0ZV9pZCI6MjY5NTQ4NDUzMDcyMDk1MX0%3D");
         driver.findElement(By.name("email")).sendKeys("aishwaryaviptal@gmail.com");
         driver.findElement(By.id("pass")).sendKeys("Aish@143");
         driver.findElement(By.name("login")).click();
         driver.navigate().back();
         Thread.sleep(1000);
         driver.findElement(By.linkText("Sign up for Facebook")).click();
         Thread.sleep(1000);
         driver.navigate().back();
         driver.findElement(By.linkText("Forgotten account?")).click();
	}

}
