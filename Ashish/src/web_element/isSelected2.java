package web_element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelected2 {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\installer\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");//not complete yet errror occure
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();
		Thread.sleep(4000);
		//driver.findElement(By.xpath("//input[@class=\"_8esa\"]")).click();
		
		driver.findElement(By.xpath("//input[@class=\"_8esa\"]")).isSelected();
		Thread.sleep(4000);
		if(driver.findElement(By.xpath("//input[@class=\"_8esa\"]")).isSelected()==false) {
			
			driver.findElement(By.xpath("//input[@class=\"_8esa\"]")).click();
			
	   
		}
		System.out.println(	driver.findElement(By.xpath("//input[@class=\"_8esa\"]")).isSelected()
		);
	
		}
		
		
}
