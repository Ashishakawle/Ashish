package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link_text {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\installar\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver ();
		
		driver.get("https://www.instagram.com/?hl=en");
		
		Thread.sleep(3000);
		
	//	driver.findElement(By.linkText("Forgot password?")).click();
		
		//2partial linktext
		
		driver.findElement(By.partialLinkText("Forgot")).click();
		
		
		
	}

}
