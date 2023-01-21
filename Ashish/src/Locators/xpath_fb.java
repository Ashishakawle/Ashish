package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_fb {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\installar\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver ();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("88056964");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@class=\"inputtext _55r1 _6luy _9npi\"]")).sendKeys("sid1234");
		Thread.sleep(3000);
		
	    driver.findElement(By.xpath("//div[@class=\"_9lsb _9ls8\"]")).click();
	    Thread.sleep(3000);
	
	//	driver.findElement(By.xpath("//button[@class=\"_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy\"]")).click();
	//	Thread.sleep(3000);
		
		//driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
		//Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[contains(text(),'Forgotten password?')]")).click();
		
		
		
		
	}

}
