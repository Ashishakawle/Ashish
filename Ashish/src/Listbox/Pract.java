package Listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Pract {
	
public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","C:\\installar\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();
		Thread.sleep(3000);
		
	   WebElement day =driver.findElement(By.xpath("//select[@id=\"day\"]"));                              

	      Select sid=new Select(day);
	   List<WebElement> totaldays =  sid.getOptions();
	   System.out.println(totaldays.size());
	    
	   Thread.sleep(3000);
	WebElement month= driver.findElement(By.xpath("//select[@id=\"month\"]"));
	 
	 Select vivek =new Select(month);
     List <WebElement> totalmonth  = vivek.getOptions();
     System.out.println(totalmonth.size());
     
   WebElement year = driver.findElement(By.id("year"));
       
         Select sid2=new Select(year);
          List<WebElement> totalyears = sid2.getOptions();
          System.out.println(totalyears.size());
          
     for(int m=0; m<totalyears.size(); m++) {
    	 String listyears =totalyears.get(m).getText();
    	 System.out.println(listyears);
    	 
    	 if(listyears.equals("2019")) {
    		 totalyears.get(m).click();
    	 }
     }
     
}
}