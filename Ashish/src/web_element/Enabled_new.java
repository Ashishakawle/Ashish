package web_element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Enabled_new {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\installer\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(4000);
		
     	boolean c=driver.findElement(By.xpath("//h2[@class=\"_8eso\"]")).isDisplayed();
	    System.out.println(c);
	    System.out.println(driver.findElement(By.xpath("//h2[@class=\"_8eso\"]")).isDisplayed());
		
		driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();
		Thread.sleep(4000);
		
    	boolean b=	driver.findElement(By.xpath("//button[@class=\"_6j mvm _6wk _6wl _58mi _3ma _6o _6v\"]")).isEnabled();
		System.out.println(b);
		
		

}
}