import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Demo3 {

	static String browser="Chrome";
	static RemoteWebDriver driver;
	public static void main(String[] args) {
		switch(browser) {
		case "Chrome":
			driver = new ChromeDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		}
		driver.get("https://surendrareddy1248.github.io/WebElementsTesting/");
		driver.manage().window().maximize();
		
		List<WebElement> elements = driver.findElements(By.tagName("a"));
		for(int i=0;i<elements.size();i++) {
			if(elements.get(i).getText().length()>0) {
				System.out.println(elements.get(i).getText());
			}
		}
		driver.quit();
	}

}