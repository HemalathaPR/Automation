package com.testcase;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {

	
	ChromeDriver driver;
	@BeforeMethod
	public void setUp() {
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("http://www.google.com/");
	}
	
	@Test(priority=1,description = "FIRST test case")
	public void googleTitleTest () {
		String title = driver.getTitle();
		System.out.println(title);
	}
	@Test(priority=2,groups="Title")
	public void googleLogoTest() {
	boolean b = driver.findElement(By.xpath("//img[@alt='Google']")).isDisplayed();
	}
	
	@Test(priority=3,groups="logos")
	public void mailLinks() {
	boolean b=driver.findElement(By.linkText("Gmail")).isDisplayed();	
	}
	@Test(priority=4,groups="logos")
	public void nameCountry() {
	boolean b=driver.findElement(By.xpath("//div[normalize-space()='India']")).isDisplayed();	
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	}



