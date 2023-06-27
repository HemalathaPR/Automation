package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Opstool {
	 WebDriver d;
	 @BeforeMethod
	 public void Login() {
		 d =new ChromeDriver();
		 d.get("https://ci-ops.ather.io/auth/login?redirect=/");
		System.out.println(d.getTitle());
		Assert.assertEquals("Charging Infra", d.getTitle());
		d.findElement(By.name("email")).sendKeys("hemalatha.pr@atherenergy.com");
		d.findElement(By.name("password")).sendKeys("Hema@9741");
	    d.findElement(By.name("password")).submit();
		 
	 }
	 
	 @Test
	 public void open() {
		

	 }

}
