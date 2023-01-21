package listbox_2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fb_without_select_class {
	
static WebDriver driver;

public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","C:\\installar\\chromedriver.exe");
		
		   driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();
		Thread.sleep(2000);
		   String days_xpath ="//select[@id=\"day\"]//option";
		   String months_xpath ="//select[@id=\"month\"]//option";
		   String years_xpath ="//select[@id=\"year\"]//option";
		  
		   String dob="7-Apr-1994";
		 String []date = dob.split("-");
		   
		   listbox(days_xpath, date[0]);
		   listbox(months_xpath,date[1]);
		   listbox(years_xpath, date[2]);
		
}
public static void listbox(String xpath,String values ) {
	
	      List<WebElement> select =driver.findElements(By.xpath(xpath));
	      System.out.println(select.size());
	      
	      for(int i=0; i<select.size(); i++) {
	    	  System.out.println(select.get(i).getText());
	    	  
	    if(select.get(i).getText().equals(values)) {
	    	select.get(i).click();
	    }
	      }
	
}
}
