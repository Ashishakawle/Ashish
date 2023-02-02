package action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo_automation_testing {


public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver","C:\\installar\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver ();
		
	    driver.get("http://demo.automationtesting.in/Register.html");
	
	    Actions act=new Actions(driver);
	
	    WebElement switchto =driver.findElement(By.xpath("//a[contains(text(),'SwitchTo')]"));
	
	 //   WebElement window  =driver.findElement(By.xpath("//a[contains(text(),'Windows')]"));
	    
	 //   act.moveToElement(switchto).moveToElement(window).click().build().perform();
	  
	 WebElement aler =  driver.findElement(By.xpath("//a[contains(text(),'Alerts')]"));
	 
	 act.moveToElement(switchto).moveToElement(aler).click().build().perform();
	  
	    
}
}