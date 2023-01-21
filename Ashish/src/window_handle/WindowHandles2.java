package window_handle;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles2 {
	


	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\installar\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.xpath("//a[contains(text(),'OrangeHRM, Inc')]")).click();
		
		Set<String> windowID =driver.getWindowHandles();
		 
		 Iterator<String>  it =windowID.iterator();
		 
	     String parentwindow= it.next();
	     String childwindow = it.next();
	     
	     System.out.println("parentwindow ID :"+parentwindow);
	     System.out.println("childwindow ID :"+childwindow);
	    
	     //second method ArrayList/List
	      @SuppressWarnings({ "rawtypes", "unchecked" })
		List<String> windows=new ArrayList(windowID);//converting set to list
	       String parentID=windows.get(0);
	       String childID=windows.get(1);
	       
	       System.out.println("parentwindow ID :"+parentID);
		     System.out.println("childwindow ID :"+childID);
	      
	     
	       
	     
	     
	    
		      


}
}