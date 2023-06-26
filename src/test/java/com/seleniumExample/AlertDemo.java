package com.seleniumExample;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;

public class AlertDemo 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\eclipse\\ChromeDriver\\chromedriver.exe");
     	WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
        driver.manage().window().maximize();
        
        driver.findElement(By.name("submit")).click();
        Alert alt = driver.switchTo().alert();
        alt.accept();
        
        System.out.println(alt.getText());
	}

}
