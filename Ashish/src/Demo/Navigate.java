package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\installar\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		Thread.sleep(5000);
		
	    String page1 =driver.getTitle();
	     System.out.println(page1);
		   
		   driver.navigate().to("https://www.amazon.com");
		   
		   Thread.sleep(5000);
		   	     
		     String page2=driver.getTitle();
		     System.out.println(page2);
		     
		     driver.navigate().back();
		     Thread.sleep(5000);
		     
		     driver.navigate().refresh();
		     
		     driver.navigate().forward();
		     Thread.sleep(5000);
		     
		//     System.out.println(driver.getTitle());
		     
		     driver.close();
		
	}

}
