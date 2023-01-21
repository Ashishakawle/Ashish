package window_handle;


import java.util.Iterator;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles3 {
	
	

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\installer\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
driver.findElement(By.xpath("//a[contains(text(),'OrangeHRM, Inc')]")).click(); 
		
        Set<String> windowid =driver.getWindowHandles();
        
                Iterator<String> it  = windowid.iterator();
                
                       String parent = it.next();
                       String child =it.next();
                       
                       System.out.println("parent ID :"+parent);
                       System.out.println("Child ID"+child);
                       
            //         List<String> xyz=new ArrayList(windowid); 
                       driver.switchTo().window(parent);
                       System.out.println(driver.getTitle());
                      driver.switchTo().window(child);
                      System.out.println(driver.getTitle());
                      
        driver.findElement(By.xpath("//a[@class=\"btn-orange contact-ohrm \"]")).click();
            
            driver.findElement(By.xpath("//input[@id=\"Form_submitForm_FullName\"]")).sendKeys("Shinde");
                     
		  driver.switchTo().window(parent);
		  System.out.println(driver.getCurrentUrl());
		  
		  driver.switchTo().window(child);
		  System.out.println(driver.getCurrentUrl());
		  
		  //second option
		  
		  for(String wind:windowid ) {	  
		//	 System.out.println(wind);  //it will print id
			  
			String title = driver.switchTo().window(wind).getTitle();
			  System.out.println(title);
		  }
		  
		driver.quit();
		
}
}