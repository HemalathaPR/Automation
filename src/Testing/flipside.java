package Testing;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class flipside {
// printing the name and price of the mobile side by side using for loop
	public static void main(String[] args) throws InterruptedException {

		ChromeDriver d = new ChromeDriver();
		d.get("https://www.flipkart.com/");
		WebDriverWait wait = new WebDriverWait (d, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'✕')]"))).click();
		
		// Find the search box and enter "mobile"
		WebElement search =d.findElement(By.name("q"));
		search.sendKeys("mobiles");
		search.submit();
      
     
		Thread.sleep(10000);
		
		List<WebElement> nameElements = d.findElements(By.xpath("//div[@class='_4rR01T']"));
		List<WebElement> priceElements = d.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));

		List<String> names = new ArrayList<>();
		List<String> prices = new ArrayList<>();

		for (int i = 0; i < nameElements.size(); i++) {
		    String name = nameElements.get(i).getText();
		    String price = priceElements.get(i).getText().replaceAll("[^0-9]", "");
		    names.add(name);
		    prices.add(price);
		}

		// Sort the names in descending order
		Collections.sort(names, Comparator.reverseOrder());

		// Print the sorted names and prices
		for (int i = 0; i < names.size(); i++) {
		    System.out.println(names.get(i) + " - " + prices.get(i));
		}
	
		 d.quit();
	}
}
