package popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup4 {
	

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\installar\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver ();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		

		driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]")).click();
		Thread.sleep(3000);
	
	      Alert text=driver.switchTo().alert();
	 
	      
	      text.sendKeys("hello");
	      
	    String ss = text.getText();
	    System.out.println(ss);
	     Thread.sleep(3000);
	     
	      text.accept();
}
}