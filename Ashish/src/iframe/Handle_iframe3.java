package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_iframe3 {

public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","C:\\installar\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Frames.html");
		
		driver.findElement(By.xpath("//a[contains(text(),'Iframe with in an Iframe')]")).click();
		Thread.sleep(2000);
		
	 WebElement Outerframe =driver.findElement(By.xpath("//div[@id=\"Multiple\"]//iframe"));
		
	 driver.switchTo().frame(Outerframe);
	 
	WebElement innerframe= driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
	
	driver.switchTo().frame(innerframe);
	
	driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Welcome");
						
	driver.switchTo().defaultContent();
	
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//a[contains(text(),'Home')]")).click();
}
}