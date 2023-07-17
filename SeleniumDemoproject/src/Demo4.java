import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://surendrareddy1248.github.io/WebElementsTesting/");
		driver.findElement(By.linkText("Open a popup window")).click();
	    Set<String> winIds = driver.getWindowHandles();
		Iterator<String> Itr = winIds.iterator();
		String parentwinId = Itr.next();
		String childwinId = Itr.next();
		driver.switchTo().window(childwinId);
		String txt = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/p/a")).getText();
		System.out.println(txt);
		driver.quit();

	}

}
