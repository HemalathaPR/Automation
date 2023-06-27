package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;
// to fetch all the mobiles present in the first page (for each loop ),explicit wait with elementToBeClickable 
public class fliptets {
	
	public static void main(String[] args) throws InterruptedException {

		ChromeDriver d = new ChromeDriver();
		d.get("https://www.flipkart.com/");
		WebDriverWait wait = new WebDriverWait (d, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'✕')]"))).click();
		
		// Find the search box and enter "mobile"
		WebElement search =d.findElement(By.name("q"));
		search.sendKeys("mobiles");
		search.submit();
      
        
     // Fetch the name and price of the first mobile
		// Wait for the element to be visible
		Thread.sleep(10000);
		
	List<WebElement>mobileElement =d.findElements(By.xpath("//div[@class='_4rR01T']"));
     for(WebElement e :mobileElement) {
    	 System.out.println(e.getText());
     }
     List<WebElement> price = d.findElements(By.xpath("//div[@class=\"_30jeq3 _1_WHN1\"]"));
     for(WebElement e :price) {
    	 System.out.println(e.getText().replaceAll("[^0-9]", ""));
     }
		 // Close the browser
        d.quit();

	
	}
	}



 



