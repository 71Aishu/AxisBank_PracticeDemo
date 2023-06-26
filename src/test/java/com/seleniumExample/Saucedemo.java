package com.seleniumExample;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Saucedemo 
{
	public static void main(String[] args) throws InterruptedException 
	{
    	System.setProperty("webdriver.chrome.driver", "E:\\eclipse\\ChromeDriver\\chromedriver.exe");
     	WebDriver driver = new ChromeDriver();
     	driver.get("https://www.saucedemo.com/");
     	driver.manage().window().maximize();
     	System.out.println(driver.getTitle());
     	Thread.sleep(1000);
     	
     	// Login functionality
     	
     	driver.findElement(By.xpath("//*[@id='user-name']")).sendKeys("standard_user");
     	driver.findElement(By.xpath("//*[@id='password']")).sendKeys("secret_sauce");
     	driver.findElement(By.xpath("//*[@id='login-button']")).click();
     	 
     	// Add to cart functionality
     	
     	driver.findElement(By.xpath("//*[@id='add-to-cart-sauce-labs-backpack']")).click();
     	Thread.sleep(1000);
     	driver.findElement(By.xpath("//*[@id='add-to-cart-sauce-labs-bike-light']")).click();
     	Thread.sleep(1000);
     	driver.findElement(By.xpath("//*[@id='add-to-cart-sauce-labs-bolt-t-shirt']")).click();
     	Thread.sleep(1000);
     	driver.findElement(By.xpath("//*[@id='add-to-cart-sauce-labs-fleece-jacket']")).click();
     	Thread.sleep(1000);
     	driver.findElement(By.xpath("//*[@id='add-to-cart-sauce-labs-onesie']")).click();
     	Thread.sleep(1000);
     	driver.findElement(By.xpath("//*[@id='add-to-cart-test.allthethings()-t-shirt-(red)']")).click();
     	
     	// Cart Button
     	
     	driver.findElement(By.xpath("//*[@id='shopping_cart_container']")).click();
     	Thread.sleep(1000);
     	
     	// Remove the Product from the cart 
     	
     	driver.findElement(By.xpath("//*[@id='remove-sauce-labs-backpack']")).click();
     	Thread.sleep(1000);
     	driver.findElement(By.xpath("//*[@id='remove-sauce-labs-bike-light']")).click();
     	Thread.sleep(1000);
     	driver.findElement(By.xpath("//*[@id='remove-sauce-labs-bolt-t-shirt']")).click();
     	Thread.sleep(1000);
     	driver.findElement(By.xpath("//*[@id='remove-sauce-labs-fleece-jacket']")).click();
     	Thread.sleep(1000);
     	driver.findElement(By.xpath("//*[@id='remove-sauce-labs-onesie']")).click();
     	Thread.sleep(1000);
     	driver.findElement(By.xpath("//*[@id='remove-test.allthethings()-t-shirt-(red)']")).click();
     	Thread.sleep(1000);
     	
     	// Navigate to the HomePage and add again all products
     	
     	driver.navigate().back();
     	Thread.sleep(1000);
     	driver.findElement(By.xpath("//*[@id='add-to-cart-sauce-labs-backpack']")).click();
     	Thread.sleep(1000);
     	driver.findElement(By.xpath("//*[@id='add-to-cart-sauce-labs-bike-light']")).click();
     	Thread.sleep(1000);
     	driver.findElement(By.xpath("//*[@id='add-to-cart-sauce-labs-bolt-t-shirt']")).click();
     	Thread.sleep(1000);
     	driver.findElement(By.xpath("//*[@id='add-to-cart-sauce-labs-fleece-jacket']")).click();
     	Thread.sleep(1000);
     	driver.findElement(By.xpath("//*[@id='add-to-cart-sauce-labs-onesie']")).click();
     	Thread.sleep(1000);
     	driver.findElement(By.xpath("//*[@id='add-to-cart-test.allthethings()-t-shirt-(red)']")).click();
     	Thread.sleep(1000);
     	
     	// Navigate to the cart and click on the checkout button
     	driver.findElement(By.xpath("//*[@id='shopping_cart_container']")).click();
     	Thread.sleep(1000);
     	
     	driver.findElement(By.xpath("//*[@id='checkout']")).click();
     	Thread.sleep(1000);
     	driver.findElement(By.xpath("//*[@id='first-name']")).sendKeys("Aishwarya");
     	driver.findElement(By.xpath("//*[@id='last-name']")).sendKeys("Viptal");
     	driver.findElement(By.xpath("//*[@id='postal-code']")).sendKeys("411057");
     	Thread.sleep(1000);
     	driver.findElement(By.xpath("//*[@id='continue']")).click();
     	
     	// Some headers are enable or not check 
     	
     	System.out.println("List of the Headers : ");
     	
     	WebElement wd = driver.findElement(By.xpath("//*[text()='Checkout: Overview']"));
     	if(wd.isDisplayed())
     	{
     		System.out.println("The Checkout:Overview is enabled. Return: " +wd.isDisplayed());
     	}
     	else
     	{
     		System.out.println("The Checkout:Overview is not enabled. Return: " +wd.isDisplayed());
     	}
     	
     	System.out.println();
     	
     	WebElement wd1 = driver.findElement(By.xpath("//*[text()='Payment Information']"));
     	if(wd1.isDisplayed())
     	{
     		System.out.println("The Payment Information is enabled. Return: " +wd1.isDisplayed());
     	}
     	else
     	{
     		System.out.println("The Payment Information is not enabled. Return: " +wd1.isDisplayed());
     	}
     	System.out.println();
     	
     	WebElement wd2 = driver.findElement(By.xpath("//*[text()='Shipping Information']"));
     	if(wd2.isDisplayed())
     	{
     		System.out.println("The Shipping Information is enabled. Return: " +wd2.isDisplayed());
     	}
     	else
     	{
     		System.out.println("The Shipping Information is not enabled. Return: " +wd2.isDisplayed());
     	}
     	
     	System.out.println();
     	
     	WebElement wd3 = driver.findElement(By.xpath("//*[text()='Price Total']"));
     	if(wd3.isDisplayed())
     	{
     		System.out.println("The Price Total is enabled. Return: " +wd3.isDisplayed());
     	}
     	else
     	{
     		System.out.println("The Price Total is not enabled. Return: " +wd3.isDisplayed());
     	}
     	
     	System.out.println();
     	
     	WebElement wd4 = driver.findElement(By.xpath("//*[text()='Total: $']"));
     	if(wd4.isDisplayed())
     	{
     		System.out.println("The Total: $ is enabled. Return: " +wd4.isDisplayed());
     	}
     	else
     	{
     		System.out.println("The Total: $ is not enabled. Return: " +wd4.isDisplayed());
     	}
     	
     	System.out.println();
     	
     	// click on the Finish
     	driver.findElement(By.xpath("//*[text()='Finish']")).click();
     	Thread.sleep(1000);
     	
     	
     	// Check the next page headers 
     	
     	WebElement w = driver.findElement(By.xpath("//*[text()='Thank you for your order!']"));
     	if(w.isDisplayed())
     	{
     		System.out.println("The Thank you for your order! is enabled. Return: " +w.isDisplayed());
     	}
     	else
     	{
     		System.out.println("The Thank you for your order! is not enabled. Return: " +w.isDisplayed());
     	}
     	
     	System.out.println();
     	
     	WebElement w2 = driver.findElement(By.xpath("//*[text()='Your order has been dispatched, and will arrive just as fast as the pony can get there!']"));
     	if(w2.isDisplayed())
     	{
     		System.out.println("The Your order has been dispatched, and will arrive just as fast as the pony can get there! is enabled. Return: " +w2.isDisplayed());
     	}
     	else
     	{
     		System.out.println("The Your order has been dispatched, and will arrive just as fast as the pony can get there! is not enabled. Return: " +w2.isDisplayed());
     	}
     	
     	System.out.println();
     	
     	WebElement w1 = driver.findElement(By.xpath("//*[text()='Back Home']"));
     	if(w1.isDisplayed())
     	{
     		System.out.println("The Back Home is enabled. Return: " +w1.isDisplayed());
     	}
     	else
     	{
     		System.out.println("The Back Home is not enabled. Return: " +w1.isDisplayed());
     	}
	} 	
}
