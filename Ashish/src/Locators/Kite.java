package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Kite {
	
	public static void main(String[] args) {
		
	
		System.setProperty("webdriver.chrome.driver","C:\\installar\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver ();
	
	driver.get("https://kite.zerodha.com/");
	
	driver.findElement(By.id("userid")).sendKeys("123456");
	
	driver.findElement(By.id("password")).sendKeys("ahad123");
	
	driver.findElement(By.xpath("//button[@class=\"button-orange wide\"]")).click();
	
	//driver.findElement(By.xpath("//a[text()='Forgot user ID or password?']")).click();
	
	driver.findElement(By.xpath("//a[contains(text(),'Forgot user ID or password?')]")).click();
	
	}	

}
