package web_element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\installer\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("Sid1@234");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id=\"email\"]")).clear();
		
		driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("Dj@170");
		
		driver.findElement(By.xpath("//input[@id=\"pass\"]")).sendKeys("189467");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id=\"pass\"]")).clear();
		
		
		
		
	}

}
