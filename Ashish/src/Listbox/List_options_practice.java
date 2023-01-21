package Listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class List_options_practice {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\installer\\chromedriver.exe");
		
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
    	//total no of size
    	 List<WebElement> totalday = select.getOptions();
    		System.out.println(totalday.size());
    		
    	//print total day
    for(int i=0; i<totalday.size(); i++) {
    String valuesofday	=totalday.get(i).getText();
    System.out.println(valuesofday);
    
    //select dd by using get method
    if(valuesofday.equals("5")) {
    	totalday.get(i).click();
    }
    }
    System.out.println("**********************");
      WebElement month = driver.findElement(By.xpath("//select[@id=\"month\"]"));      
      Select select1=new Select(month);
    
          List<WebElement> totalmonth =select1.getOptions();
          System.out.println(totalmonth.size());//total month size
          
          for(int j=0; j<totalmonth.size(); j++) {//print total values/month
        	String monthvalues = totalmonth.get(j).getText();
        	System.out.println(monthvalues);
        	
        	if(monthvalues.equals("Jun")) {
        		totalmonth.get(j).click();
        	}
          }
          System.out.println("******************************");
        WebElement year = driver.findElement(By.xpath("//select[@id=\"year\"]"));
        Select select3=new Select(year);
           List<WebElement> totalyears =select3.getOptions();
           System.out.println(totalyears.size());//find out size of years
           
           for(int k=0; k<totalyears.size(); k++) {
        	 String yearsvalues = totalyears.get(k).getText();
        	 System.out.println(yearsvalues);//print total values
        	 
        	 if(yearsvalues.equals("2020")) {
        		 totalyears.get(k).click();//select year by using get method
        	 }
           }
          
    }
}    	

