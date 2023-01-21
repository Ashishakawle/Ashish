package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox_new {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\installar\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.cowin.gov.in/");
	Thread.sleep(4000);
WebElement state=	driver.findElement(By.xpath("//span[@class=\"mat-select-placeholder mat-select-min-line ng-tns-c69-337 ng-star-inserted\"]"));
	
	Select select=new Select(state);
	select.selectByVisibleText("Maharashtra");

// driver.findElement(By.xpath("//div[@id=\"mat-select-value-7\"]")).click();

	}
}