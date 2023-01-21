package Listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Without_select_class2 {
	
	

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\installer\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[contains(@id,\"u_0_2_\")]")).click();
		
		Thread.sleep(3000);
	
		 List<WebElement> daylist = driver.findElements(By.xpath("//select[@id=\"day\"]//option"));
		 	 
		 for(int i=0; i<daylist.size(); i++) {
			 
			 if(daylist.get(i).getText().equals("17")) {
				 daylist.get(i).click();
			 }
		 }
		 
		 
		 List<WebElement> monthlist = driver.findElements(By.xpath("//select[@id=\"month\"]//option"));
		 
		 for(int j=0; j<monthlist.size(); j++) {
			 
			 if(monthlist.get(j).getText().equals("May")) {
				 monthlist.get(j).click();
			 }
		 }
		 
		 List<WebElement> yearlist = driver.findElements(By.xpath("//select[@id=\"year\"]//option"));
		 
		 for(int k=0; k<yearlist.size(); k++) {
			 
			 if(yearlist.get(k).getText().equals("1999")) {
				 yearlist.get(k).click();
			 }
		 }
		 
		 
		
}
}
