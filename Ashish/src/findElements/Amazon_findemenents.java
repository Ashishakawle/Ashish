package findElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_findemenents {
	
	
public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","C:\\installar\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		
		
         List<WebElement> links =driver.findElements(By.xpath("//a[@class=\"nav-a  \"]"));
         System.out.println(links.size());
         
         for(WebElement abc: links) {
        	 System.out.println(abc.getText());
         }
         
	
}
}