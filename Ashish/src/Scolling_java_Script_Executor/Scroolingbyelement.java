package Scolling_java_Script_Executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroolingbyelement {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\installar\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/");
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
        WebElement element =driver.findElement(By.xpath("//a[contains(text(),'Get Started for Free')]"));
       
        js.executeScript("arguments[0].scrollIntoView();",element);
		
		
		
	}

}
