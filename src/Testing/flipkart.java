package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
//to fetch the name and price of first mobile present in the first page,explicit wait with visibilityOfElementLocated 
public class flipkart {
	
	public static void main(String[] args) {

		ChromeDriver d = new ChromeDriver();
		d.get("https://www.flipkart.com/");
		WebDriverWait wait = new WebDriverWait (d, Duration.ofSeconds(3));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'✕')]"))).click();
		
		// Find the search box and enter "mobile"
		WebElement search =d.findElement(By.name("q"));
		search.sendKeys("mobiles");
		search.submit();
      
        
     // Fetch the name and price of the first mobile
		// Wait for the element to be visible
		WebDriverWait wait1 = new WebDriverWait(d, Duration.ofSeconds(10));
		WebElement mobileElement = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='_4rR01T']")));

		// Print the name of the first mobile
		System.out.println("Name of the first mobile displayed on Flipkart: " + mobileElement.getText());
		WebElement price = d.findElement(By.xpath("//div[@class=\"_30jeq3 _1_WHN1\"]"));
		
		//String cleanedPrice = price.getText().replaceAll("[^0-9]", "");
		System.out.println("Price of the first mobile displayed on Flipkart: " + price.getText().replaceAll("[^0-9]", ""));

        // Close the browser
        d.quit();

	
	}
	}



 



