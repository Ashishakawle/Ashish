package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gettitle2 {

	public static void main(String[] args) throws InterruptedException {
		
		 String expectedresult="Amazon.com. Spend less. Smile more.";
		 
		 System.setProperty("webdriver.chrome.driver","C:\\installar\\chromedriver.exe");
		
	
	WebDriver driver =new ChromeDriver();	
	
	driver.get("https://www.Amazon.com");
	
	Thread.sleep(3000);
	
	    String title  =driver.getTitle();
	    
	    System.out.println(title);
	    
	  if(expectedresult.equals(title)) {
		   System.out.println("correct title");
	   }
	   else {
		System.out.println("wrong title");
	}
driver.close();
}
}
