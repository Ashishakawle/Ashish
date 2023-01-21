package listbox_2;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbuslistbox1 {


public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","C:\\installar\\chromedriver.exe");
		
		WebDriver  driver = new ChromeDriver();
		
		driver.get("https://www.redbus.in/");
		
		driver.findElement(By.xpath("//input[@id=\"src\"]")).sendKeys("Pune");
		Thread.sleep(3000);
		
	List<WebElement>  cityfrom	=driver.findElements(By.xpath("//ul[@class=\"autoFill homeSearch\"]//li"));
	
	System.out.println(cityfrom.size());
	
	for(int i=0; i<cityfrom.size(); i++) {
		System.out.println(cityfrom.get(i).getText());
		
		if(cityfrom.get(i).getText().equals("Railway Station, Pune")) {
			cityfrom.get(i).click();
			break;
		}
	}
	
}
}
