package Scolling_java_Script_Executor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_Till_Bottom {

	public static void main(String[] args) throws InterruptedException {
		
	
		System.setProperty("webdriver.chrome.driver","C:\\installar\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get("https://www.w3schools.com/");
	
	JavascriptExecutor js=(JavascriptExecutor) driver;
	
	js.executeScript("window.scrollTo(0,document.body.scrollHeight)");  
	Thread.sleep(5000);
	js.executeScript("document.documentElement.scrollTop=0");
	
	
}
}