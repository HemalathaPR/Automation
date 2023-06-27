package com.testcase;

import org.testng.annotations.Test;

public class TestingFeatures {

	@Test
	public void LoginTest() {
		System.out.println("login test");
		int i=9/0;
	}
	
	@Test(dependsOnMethods="LoginTest")
	public void HomePageTest() {
		System.out.println("home page test");
	}
	
	@Test(dependsOnMethods="LoginTest")
	public void registerPageTest() {
		System.out.println("register page test");
	}
	
	@Test(dependsOnMethods="LoginTest")
	public void searchPageTest() {
		System.out.println("serch page test");
	}
}
