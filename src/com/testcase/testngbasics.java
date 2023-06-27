package com.testcase;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


/*@before method
 * @test 1
 * @after method
 * 
 * @before method
 * @test2
 * @after method
 */

public class testngbasics {
// preconditions annotations --- starting with @Before
	@BeforeSuite
	public void setUp() {
	System.out.println("setup system property for chrome");
	}
	
	@BeforeTest
	public void launchBrowser() {
		System.out.println("launch browser");
	}
	
	
	@BeforeClass
	public void login() {
		System.out.println("login to app");
	}
	
	@BeforeMethod
	public void enterURL() {
		System.out.println("enter the url");
	}
	// test cases written in @Test
	@Test
	public void googleTitleTest() {
		System.out.println("google title test");
	}
	
	@Test
	public void searchTitle() {
		System.out.println("Search title");
	}
	
	//post-condition annotations --- starting with @After
	@AfterMethod
	public void logOut() {
		System.out.println("logout from app");
	}
	
	@AfterClass
	public void deleteAllCookies() {
		System.out.println("delete all the cookies");
	}
	
	@AfterTest
	public void closeBrowser() {
		System.out.println("close the browser");
	}
	
	@AfterSuite
	public void generateTestReport() {
		System.out.println("generate the report");
	}
	

	}	
	
	
	
	
	
	

