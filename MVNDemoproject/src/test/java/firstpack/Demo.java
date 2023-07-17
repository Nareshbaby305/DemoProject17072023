package firstpack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://naveenautomationlabs.com/opencart/");
	driver.findElement(By.xpath("//a[@title='My Account']")).click();
	driver.findElement(By.xpath("//a[contains(text(),'Register')]")).click();
	
	if(driver.findElement(By.xpath("//ul[@class='breadcrumb']//a[text()='Register']")).isDisplayed()) {
	System.out.println("Test is passed");
	}
	else {
		System.out.println("Test is failed");
	}
	driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys("Naresh");
	driver.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys("Kumar");
	driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("naresh24689@gmail.com");
	driver.findElement(By.xpath("//input[@id='input-telephone']")).sendKeys("9666867929");
	driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("naresh@143");
	driver.findElement(By.xpath("//input[@id='input-confirm']")).sendKeys("naresh@143");
	driver.findElement(By.xpath("//input[@name='agree']")).click();
	driver.findElement(By.xpath("//input[@value='Continue']")).click();
	
	String expsuccesmsg = "Your Account Has Been Created!";
	String actsuccesmsg = driver.findElement(By.xpath("//div[@id='content']/h1")).getText();
	
	if(actsuccesmsg.equals(expsuccesmsg)) {
		System.out.println("Test is passed");
	}
	else {
		
		System.out.println("Test is failed");
	}
	driver.quit();
	}
	}
