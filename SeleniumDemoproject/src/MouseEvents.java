import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseEvents {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://naveenautomationlabs.com/opencart/");
		
		Actions act = new Actions(driver);
		WebElement element = driver.findElement(By.xpath("//a[text()='Desktops']"));
		act.moveToElement(element).perform();
		WebElement element2 = driver.findElement(By.xpath("//a[text()='Show All Desktops']"));
		act.moveToElement(element2).click().build().perform();
		
		

	}

}
