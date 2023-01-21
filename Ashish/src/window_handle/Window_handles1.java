package window_handle;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_handles1 {
	

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\installar\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.xpath("//a[contains(text(),'OrangeHRM, Inc')]")).click();
		
		  Set<String> windowID2  = driver.getWindowHandles();
	//	  System.out.println(windowID2);
		  
		   Iterator<String> it  =windowID2.iterator();
		              
		             String parentwindow =it.next();
		           System.out.println("parentwindow :"+parentwindow);
		           
		         String childwindow  =it.next();
		         System.out.println("childwindow :"+childwindow);
		  
		

}
}