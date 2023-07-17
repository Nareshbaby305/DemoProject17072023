import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlert {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://surendrareddy1248.github.io/WebElementsTesting/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@id='but11']")).click();
		Alert alert = driver.switchTo().alert();
		String txt = alert.getText();
		System.out.println("Text on Alert is : "+txt);
		alert.accept();
		Thread.sleep(2000);
		driver.quit();
			

	}

	
}
