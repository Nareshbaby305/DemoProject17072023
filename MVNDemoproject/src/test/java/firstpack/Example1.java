package firstpack;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Example1 {
    @Test
	public void sampleTest() {
		
    	WebDriver driver = new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	driver.get("https://surendrareddy1248.github.io/WebElementsTesting/");
    	System.out.println(driver.getTitle());
    	driver.quit();
    	
	}

}
