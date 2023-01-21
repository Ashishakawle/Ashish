package action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo_guru {
	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","C:\\installar\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver ();
		
	    driver.get("https://demo.guru99.com/test/drag_drop.html");
	    
	    Actions act=new Actions(driver);
	    
	  WebElement bank = driver.findElement(By.xpath("//li[@data-id=\"5\"]"));
	
	WebElement target=driver.findElement(By.xpath("//ol[@id=\"bank\"]"));
	
	act.dragAndDrop(bank, target).build().perform();
		
	WebElement fivethousand	=driver.findElement(By.xpath("(//li[@data-id=\"2\"])[2]"));
	WebElement taerget2 = driver.findElement(By.xpath("//ol[@id=\"amt7\"]"));
	
	act.dragAndDrop(fivethousand, taerget2).build().perform();
		
		
	}

}
