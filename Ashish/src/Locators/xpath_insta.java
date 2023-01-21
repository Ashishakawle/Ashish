package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_insta {
	
		
		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\installer\\chromedriver.exe");
			
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.instagram.com/?hl=en");
			
		//	driver.findElement(By.xpath("//input[@class=\"_2hvTZ pexuQ zyHYP\"]")).sendKeys("Siddhesh");
			
		driver.findElement(By.xpath("//input[@class=\"_2hvTZ pexuQ zyHYP\"]")).sendKeys("123445");
	}

}
