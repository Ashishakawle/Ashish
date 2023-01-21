package web_element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear2 {
	public static void main(String[] args) throws InterruptedException {
		
	
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\installer\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	
    WebElement pass=driver.findElement(By.xpath("//input[@id=\"email\"]"));

    pass.sendKeys("Sid@9876");
    Thread.sleep(3000);
    pass.clear();
    
    pass.sendKeys("Sids@65");
    Thread.sleep(3000);
    pass.clear();
  
    pass.sendKeys("Hitman123");
    pass.clear();
	}
}
