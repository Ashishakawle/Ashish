package action_class;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_new_abc {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\installar\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver ();
		
	    driver.get("https://www.w3schools.com/");
	    JavascriptExecutor js=(JavascriptExecutor) driver;
	    
	     js.executeScript("window.scrollBy(0,10000)","");
	     Thread.sleep(5000);
//	     js.executeScript("document.documentElement.scrollTo=0");
	    
	    
	    
	
	}	
		
}
