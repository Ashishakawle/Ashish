package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class With_select_class {
	

public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","C:\\installar\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[contains(@id,\"u_0_2_\")]")).click();
		
		Thread.sleep(3000);
	
         WebElement daylist =driver.findElement(By.xpath("//select[@id=\"day\"]"));
         WebElement monthlist =driver.findElement(By.xpath("//select[@id=\"month\"]"));
         WebElement yearlist =driver.findElement(By.xpath("//select[@id=\"year\"]"));

      String dob="11-Jan-1996";
      
        String arr[]  = dob.split("-");
        
        listbox(daylist, arr[0]);
        listbox(monthlist,arr[1]);
        listbox(yearlist, arr[2]);
}
public static void listbox(WebElement element,String value) {
	Select select=new Select(element);
	select.selectByVisibleText(value);
}
}