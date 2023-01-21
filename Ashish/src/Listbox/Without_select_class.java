package Listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Without_select_class {
	

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
		
	//	   WebElement day =driver.findElement(By.id("day"));
   
		 List<WebElement> daylist = driver.findElements(By.xpath("//select[@id=\"day\"]//option"));
		 
		 System.out.println(daylist.size());
		 
		 for(int i=0; i<daylist.size(); i++) {
			String totalday= daylist.get(i).getText();
			System.out.println(totalday);
			
			if(daylist.get(i).getText().equals("2")) {
				daylist.get(i).click();
			}
		 }
		 
		 Thread.sleep(3000);
	//	WebElement month  =driver.findElement(By.id("month"));
		List<WebElement> monthlist =driver.findElements(By.xpath("//select[@id=\"month\"]//option"));
		System.out.println(monthlist.size()); 
		
		for(int j=0; j<monthlist.size(); j++) {
		String totalmonth	=monthlist.get(j).getText();
		System.out.println(totalmonth);
		
		if(totalmonth.equals("Feb")) {
			monthlist.get(j).click();
		}
		}
		    List<WebElement> year =driver.findElements(By.xpath("//select[@id=\"year\"]//option"));
		     System.out.println(year.size());
		     
		     for(int g=0; g<year.size(); g++) {
		//    String totalyears= year.get(g).getText();
		  //  System.out.println(totalyears);
		    
		    	 System.out.println(year.get(g).getText());
		    	 
		    if(year.get(g).getText().equals("1997")) {
		    	year.get(g).click();
		    }
		    
		     }
		 
}
}
