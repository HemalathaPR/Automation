package Testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTitleTest {
	ChromeDriver driver;
	@SuppressWarnings("deprecation")
	@BeforeMethod
	public void setUp() {
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("http://www.google.com/");
	}
	@Test
	public void googleTitleTest() {
		String title = driver.getTitle();
		System.out.println(title);
		String t = "Google";
		Assert.assertEquals(title, t);	
	}
	
	@Test(priority=3,groups="logos")
	public void mailLinks() {
	boolean b=driver.findElement(By.linkText("Gmail")).isDisplayed();	
	Assert.assertFalse(b);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	
}
