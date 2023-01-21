package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drowpdown_handle {
public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","C:\\installar\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();
		Thread.sleep(3000);

		
	WebElement day=driver.findElement(By.id("day"));
    WebElement month=driver.findElement(By.id("month"));
	WebElement year = driver.findElement(By.id("year"));
	
	String date="15-Jan-1995";//test data
	String []dob=  date.split("-");
	
	drowpdown(day,dob[0]);
	drowpdown(month,dob[1]);
	drowpdown(year,dob[2]);
}

public static void drowpdown(WebElement element,String value) {
	Select select=new Select(element);
	select.selectByVisibleText(value);
}
}