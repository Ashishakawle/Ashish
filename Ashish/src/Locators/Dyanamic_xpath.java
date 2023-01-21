package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dyanamic_xpath {
	
public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","C:\\installar\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(4000);
		
	//	driver.findElement(By.xpath("//button[contains(@id,\"u_0_d_\")]")).click();
		
	driver.findElement(By.xpath("//button[starts-with(@id,\"u_0_d_\")]")).click();
	
	driver.close();
	
}
}