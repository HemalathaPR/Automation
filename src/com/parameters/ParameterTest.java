package com.parameters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {

	WebDriver d;
	@Test
	@Parameters({"url","emailId"})
	public void yahoologinTest(String url,String emailId) {
		
		d=new ChromeDriver();
	    d.get(url);
		d.findElement(By.xpath("//input[@id='login-username']")).sendKeys(emailId);
		d.findElement(By.xpath("//input[@id='login-signin']")).click();
		
	}
}
