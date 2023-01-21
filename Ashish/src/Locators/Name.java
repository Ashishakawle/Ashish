package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Name {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\installar\\chromedriver.exe");	
		
		WebDriver driver=new ChromeDriver ();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.name("email")).sendKeys("1235566");
		
		driver.findElement(By.name("pass")).sendKeys("hga1235");
		
		driver.findElement(By.name("login")).click();
		
		Thread.sleep(5000);
		
		//driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Forgotten password?')]")).click();
		
		
		
		
		
		
	}
}
