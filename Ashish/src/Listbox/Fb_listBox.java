package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Fb_listBox {
	
public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","C:\\installar\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();
		Thread.sleep(3000);
		
        driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("Siddhesh");
        driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("Shinde");
        driver.findElement(By.xpath("//input[@name=\"reg_email__\"]")).sendKeys("sishinde@123");
        driver.findElement(By.xpath("//input[@autocomplete=\"new-password\"]")).sendKeys("sishinde@123");
        
        WebElement day =driver.findElement(By.xpath("//select[@id=\"day\"]"));
        WebElement month=driver.findElement(By.xpath("//select[@id=\"month\"]"));
        WebElement year=driver.findElement(By.xpath("//select[@id=\"year\"]"));
        
       Select sid=new Select(day);
       sid.selectByVisibleText("7");
       
       Select sid2=new Select(month);
       sid2.selectByVisibleText("May");
       
       Select sid3=new Select(year);
       sid3.selectByVisibleText("2000");
}
}