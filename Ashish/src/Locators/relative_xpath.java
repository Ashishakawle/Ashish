package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class relative_xpath {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\installer\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver ();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(3000);
		
		//Dynamic Xpath
		//driver.findElement(By.xpath("//button[contains(@id,\"u_0_d_\")]")).click();
		
		//starts-with
		driver.findElement(By.xpath("//button[starts-with(@id,\"u_0_d_\")]")).click();
		
		//ends-with
	//	driver.findElement(By.xpath("//button[ends-with(@id=\"_KP\")]")).click();
	}
}
