package com.seleniumExample;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGDemo
{
@Test
public void Show()
{
	System.out.println("In the show method");
}
@ Test
public void display()
{
	System.out.println("The Display method");
}

@BeforeMethod
public void beforeMethod()
{
	System.out.println("I am in the Before Method");
}

@AfterMethod
public void afterMethod()
{
	System.out.println("I am in the after Method");
}
@BeforeClass
public void beforeclass()
{
	System.out.println("I am in the Before Class");
}
@AfterClass
public void afterClass()
{
	System.out.println("I am in the After class");
}
}
