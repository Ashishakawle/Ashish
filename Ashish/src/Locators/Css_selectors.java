package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css_selectors {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\installar\\chromedriver.exe");
		WebDriver driver=new ChromeDriver ();
		
		driver.get("https://app.hubspot.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("#username")).sendKeys("sid1235");
		Thread.sleep(3000);
		
	//	driver.findElement(By.cssSelector("input#password")).sendKeys("314676");
		
		driver.findElement(By.cssSelector("input.form-control.private-form__control.login-password.m-bottom-3")).sendKeys("145678");
		Thread.sleep(3000);
		
		
		
		
		
		
		
		
	}

}
