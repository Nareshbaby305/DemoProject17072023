import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://surendrareddy1248.github.io/WebElementsTesting/");
		driver.manage().window().maximize();
		driver.findElement(By.name("textboxn")).sendKeys("Selenium");
		String txt = driver.findElement(By.id("testtext_1")).getText();
		System.out.println(txt);
		String title = driver.getTitle();
		System.out.println("Title of the webpage is: "+title);
		String url = driver.getCurrentUrl();
		System.out.println("URL of teh page is: "+url);
		driver.findElement(By.linkText("Open a popup window")).click();
		driver.close();
	}

}
