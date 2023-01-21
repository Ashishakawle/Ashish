package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame5 {
	

	public static void main(String[] args) {
		
	
	
		System.setProperty("webdriver.chrome.driver","C:\\installar\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
	
   driver.switchTo().frame("iframeResult");//id,name,webelement,index
   driver.switchTo().frame(0);
	String abcd  =driver.findElement(By.xpath("//h1[contains(text(),'This page is displayed in an iframe')]")).getText();
	
	System.out.println(abcd);
}
}