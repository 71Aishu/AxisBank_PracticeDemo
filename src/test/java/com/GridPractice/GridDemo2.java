package com.GridPractice;
import java.net.MalformedURLException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import java.net.URL;

public class GridDemo2 
{
	@Test
    public void scenario1() throws MalformedURLException
    {
        DesiredCapabilities dc=new DesiredCapabilities();
        dc.setBrowserName("chrome");
       
        WebDriver driver=new RemoteWebDriver(new URL(" http://192.168.94.138:4444"), dc);
        driver.get("https://www.amazon.com");          
    }
}
