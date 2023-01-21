package synchronization;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_wait {
	
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\installer\\chromedriver.exe");
		
		WebDriver  driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
	@SuppressWarnings("unused")
	WebElement element	=driver.findElement(By.xpath("//input[@id=\"email\"]"));
			
			
	}

	public static void sendkeys(WebDriver driver1,WebElement element,Duration timeout,String value) {
		
		
		new WebDriverWait(driver1, timeout).until(ExpectedConditions.visibilityOf(element));
		
		element.sendKeys(value);
	}
}
