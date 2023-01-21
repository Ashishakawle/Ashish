package Listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class List_options {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\installar\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[contains(@id,\"u_0_2_\")]")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("virat");
		
		driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("kohli");
		
    	WebElement day=	driver.findElement(By.xpath("//select[@id=\"day\"]"));
    	
    	Select select =new Select(day);
    	
    	//Q.how will u get total no of size
    	
          List<WebElement> listday = select.getOptions();
          
          System.out.println(listday.size());
          
          //Q .how will u print all values of listbox
          for(int i=0; i<listday.size(); i++) {
        	String dayvalues = listday.get(i).getText();
        	System.out.println(dayvalues);
        	
        	//Q.how will u select specify values from DD with the help of get method
        	 if(dayvalues.equals("22")) {
        		 listday.get(i).click();
        	 }
          }

      	Thread.sleep(3000);
      	WebElement month= driver.findElement(By.xpath("//select[@id=\"month\"]"));
   	 
        	 Select select2 =new Select(month);
           List <WebElement> totalmonth  = select2.getOptions();
          System.out.println(totalmonth.size());
        
         for(int k=0;k<totalmonth.size(); k++) {
        	String listmonth=totalmonth.get(k).getText();
        	System.out.println(listmonth);
        	
        	Thread.sleep(3000);
        	if(listmonth.equals("Jan")) {
           totalmonth.get(k).click();
        	}
        	
                }
            
	}
}
