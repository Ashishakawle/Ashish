package popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_popup_rediff3 {
	
	
public static void main(String[] args) throws InterruptedException {
	

	System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\installer\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver ();
	
	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	
	
	driver.findElement(By.xpath("//input[@value=\"Sign in\"]")).click();
	
	    Alert validation = driver.switchTo().alert();
	    System.out.println(validation.getText());
	    
	       String text7 =validation.getText();
	       
	       if(text7.equals("Please enter a valid user name")) {
	    	   System.out.println("correct alert");
	       }
	       else {
	    	   System.out.println("incorrect alert");
	       }
	       validation.accept();
}
}