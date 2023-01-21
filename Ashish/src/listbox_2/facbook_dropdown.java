package listbox_2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facbook_dropdown {
	
static WebDriver driver;
public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","C:\\installar\\chromedriver.exe");
		
		    driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();
        Thread.sleep(2000);
		        String day_xpath = "//select[@id=\"day\"]//option";
		        String month_xpath = "//select[@id=\"month\"]//option";
		        String year_xpath = "//select[@id=\"year\"]//option";
		       
		        String dob="26-Jun-1995";
		      String []date = dob.split("-");
		      
		      listbox(day_xpath, date[0]);
		      listbox(month_xpath, date[1]);
		      listbox(year_xpath, date[2]);
		        
}
public static void listbox(String xpath,String value) throws InterruptedException {
  List<WebElement> select5 =	driver.findElements(By.xpath(xpath));
  System.out.println(select5.size());
  
  for(int i=0; i<select5.size(); i++) {
	  System.out.println(select5.get(i).getText());
	  
	  if(select5.get(i).getText().equals(value)) {
		  select5.get(i).click();
	  }
  }
  
	
}
}