package Testing;


import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class prrctise {

    public static void main(String[] args) throws InterruptedException, IOException {
        WebDriver d = new ChromeDriver();
        d.get("https://stackoverflow.com/questions/55349041/org-openqa-selenium-invalidselectorexception-invalid-selor-while-trying-to-l");
        Thread.sleep(3000);
    
		File Src = ((TakesScreenshot) d).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(Src, new File("./screenshots/screen.png"));
			
        
        // Close the browser
        d.quit();
    }
}
