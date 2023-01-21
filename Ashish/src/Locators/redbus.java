package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class redbus {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\installer\\chromedriver.exe");
				
				WebDriver driver=new ChromeDriver ();
				
				driver.get("https://m.redbus.in/");
				
				driver.findElement(By.id("src")).sendKeys("Pune");
				Thread.sleep(3000);
				driver.findElement(By.xpath("//li[@data-id=\"130\"]")).click();
				Thread.sleep(3000);
				
				driver.findElement(By.id("dest")).sendKeys("Nagpur");
				Thread.sleep(3000);
				
				driver.findElement(By.xpath("//li[@data-id=\"624\"]")).click();
				Thread.sleep(3000);
				
		driver.findElement(By.xpath("//label[contains(text(),'Onward Date')]")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//td[@class=\"current day\"]")).click();
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//button[text()='Search Buses']")).click();
				
				
				
				
		
	}
}
