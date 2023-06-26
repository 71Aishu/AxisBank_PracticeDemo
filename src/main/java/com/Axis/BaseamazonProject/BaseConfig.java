package com.Axis.BaseamazonProject;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BaseConfig 
{
	@Test
    public void getDriver() throws InterruptedException
    {
     	System.setProperty("webdriver.chrome.driver", "E:\\eclipse\\ChromeDriver\\chromedriver.exe");
     	WebDriver driver = new ChromeDriver();
     	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
     	driver.get("https://www.amazon.in/");
	    driver.manage().window().maximize();
	    Thread.sleep(1000);
	    driver.quit();
    }
}
