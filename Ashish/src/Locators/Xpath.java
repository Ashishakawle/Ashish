package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\installer\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
	    driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("8805696425");
		
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("sid123456");
		Thread.sleep(3000);
		
	driver.findElement(By.xpath("//div[@class=\"_9lsb _9ls8\"]")).click();			
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//button[@name=\"login\"]")).click();
	Thread.sleep(3000);
	
driver.findElement(By.xpath("//button[@class=\"_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy\"]")).click();
	Thread.sleep(3000);
	
	
	
		driver.close();
		
		
		
	}

}
