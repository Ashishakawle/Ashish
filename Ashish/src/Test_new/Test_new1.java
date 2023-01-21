package Test_new;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_new1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\installer\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		Thread.sleep(3000);
		
		       String s1 =driver.getTitle();
		       System.out.println(s1);
		       
		      String s2 =driver.getCurrentUrl();
		      System.out.println(s2);
		      
		  driver.navigate().to("http://www.amazon.in");  
		  
		  
		  
		  Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().refresh();
		driver.navigate().forward();
		Thread.sleep(3000);
		       
		
		driver.close();
	}

}
