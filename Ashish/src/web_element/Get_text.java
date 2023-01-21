package web_element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_text {

	public static void main(String[] args) throws InterruptedException {
				
	System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\installer\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	
String text=driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps you connect and share with the people in your life.')]")).getText();
	
    String expectedresult="Facebook helps you connect and share with the people in your life.";
    
    System.out.println(text.equals(expectedresult));
    
    
   String s= driver.findElement(By.xpath("//div[@id=\"reg_pages_msg\"]")).getText();
   
   String s1="Create a Page for a celebrity, brand or business.";
   System.out.println(s.equals(s1));
    
    driver.close();
	
}
}