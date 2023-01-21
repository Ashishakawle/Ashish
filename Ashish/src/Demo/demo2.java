package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\installar\\chromedriver.exe");
		
   String expectedresult="Google";
	
	
	WebDriver driver =new ChromeDriver();	
	
	driver.get("https://www.google.com");
	
	Thread.sleep(5000);
	
	    String title  =driver.getTitle();
	    
	    System.out.println(title);
	    
	  if(title.equals(expectedresult)) {
		   System.out.println("correct title");
	   }
	   else {
		System.out.println("wrong title");
	}
driver.close();
}
}