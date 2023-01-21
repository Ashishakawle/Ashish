package popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_popup_rediff {
	
public static void main(String[] args) throws InterruptedException {
	

	System.setProperty("webdriver.chrome.driver","C:\\installar\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver ();
	
	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	
	driver.findElement(By.xpath("//input[@name=\"login\"]")).sendKeys("Siddhesh");
	
	driver.findElement(By.xpath("//input[@title=\"Sign in\"]")).click();
	
	      Alert  alert  = driver.switchTo().alert();
	      System.out.println(alert.getText());
	      
	      Thread.sleep(3000);
	     String text = alert.getText();
	     
	     if(text.equals("Please enter your password")) {
	    	 System.out.println("correct alert message");
	     }
	     else {
	    	 System.out.println("incorrect alert message");
	     }
	     alert.accept();
	      
	
}
}
