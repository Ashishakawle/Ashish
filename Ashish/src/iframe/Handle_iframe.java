package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_iframe {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\installar\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
		driver.switchTo().frame("iframeResult");
		
		driver.findElement(By.xpath("//button[contains(text(),'Click me to display Date and Time.')]")).click();
		Thread.sleep(3000);
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//a[@id=\"tryhome\"]")).click();
		
	}
	
	
}
