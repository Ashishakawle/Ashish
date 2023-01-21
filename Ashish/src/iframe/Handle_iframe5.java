package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_iframe5 {
	
	public static void main(String[] args) {
		
	
		System.setProperty("webdriver.chrome.driver","C:\\installar\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
	
	   driver.switchTo().frame("iframeResult");
	   
	   driver.switchTo().frame(0);

	System.out.println(driver.findElement(By.xpath("//h1[contains(text(),'This page is displayed in an iframe')]")).getText());

	driver.switchTo().parentFrame();
String abc=	driver.findElement(By.xpath("//p[contains(text(),'You can use the height and width attributes to specify the size of the iframe:')]")).getText();
	System.out.println(abc);
	
	driver.switchTo().defaultContent();
	driver.findElement(By.xpath("//a[@onclick=\"ga('send', 'event', 'Breadcrumbs', 'Level 1', 'tryhtml_iframe_height_width')\"]")).click();
	}
}