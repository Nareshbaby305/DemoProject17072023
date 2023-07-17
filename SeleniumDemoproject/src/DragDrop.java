import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		WebElement source = driver.findElement(By.xpath("//div[@id='box6']"));
		WebElement target = driver.findElement(By.xpath("//div[@id='box106']"));
		Actions act = new Actions(driver);
		act.dragAndDrop(source, target).perform();
		
		WebElement source1 = driver.findElement(By.xpath("//div[@id='box3']"));
		WebElement target1 = driver.findElement(By.xpath("//div[@id='box103']"));
		
		act.clickAndHold(source1).moveToElement(target1).release().build().perform();
		
		WebElement source2 = driver.findElement(By.xpath("//div[@id='box1']"));
		WebElement traget2 = driver.findElement(By.xpath("//div[@id='box101']"));
		
		act.clickAndHold(source2).moveToElement(traget2).release().build().perform();
		
		WebElement source3 = driver.findElement(By.xpath("//div[@id='box5']"));
		WebElement target3 = driver.findElement(By.xpath("//div[@id='box105']"));
		
		act.clickAndHold(source3).moveToElement(target3).release().build().perform();
		
		WebElement source4 = driver.findElement(By.xpath("//div[@id='box7']"));
		WebElement target4 = driver.findElement(By.xpath("//div[@id='box107']"));
		
		act.clickAndHold(source4).moveToElement(target4).release().build().perform();
		
        WebElement source5 = driver.findElement(By.xpath("//div[@id='box4']"));
        WebElement target5 = driver.findElement(By.xpath("//div[@id='box104']"));
        
        act.clickAndHold(source5).moveToElement(target5).release().build().perform();
        
        WebElement source6 = driver.findElement(By.xpath("//div[@id='box2']"));
        WebElement target6 = driver.findElement(By.xpath("//div[@id='box102']"));
        
        act.clickAndHold(source6).moveToElement(target6).release().build().perform();
		
}

}
