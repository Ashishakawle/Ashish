package popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_popuprediff2 {
	
	
public static void main(String[] args) throws InterruptedException {
	

	System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\installer\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver ();
	
	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	
	driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("sid123456");
	
   driver.findElement(By.xpath("//input[@value=\"Sign in\"]")).click();
   
         Alert aler =driver.switchTo().alert();
         System.out.println(aler.getText());
     
        String text =aler.getText();
        
        if(text.equals("Please enter a valid user name")) {
        	System.out.println("coorect alert message");
        }
        else {
        	System.out.println("wrong alert message");
        }
        aler.accept();
}
}