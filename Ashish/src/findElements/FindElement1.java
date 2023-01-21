package findElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement1 {

	
public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","C:\\installar\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		
		//1.return type is webelement
	    WebElement searchbox=  driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
		searchbox.sendKeys("Oneplus");
		
		//2.
      	WebElement links=driver.findElement(By.xpath("//a[@class=\"nav \"]"));
      	System.out.println(links.getText());
		
      	
      	//3.
      	
}
}