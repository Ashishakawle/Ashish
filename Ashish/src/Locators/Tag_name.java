package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tag_name {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\app installer\\chrome driver jar\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver ();
		
		driver.get("http://demo.automationtesting.in/Windows.html");
		
		Thread.sleep(4000);
		
		driver.findElement(By.tagName("input")).click();
		
		
		
	}

}
