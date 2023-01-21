package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class maximize {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\installar\\chromedriver.exe");
		
		WebDriver sid=new ChromeDriver();
		
		sid.get("https://www.google.com");
		
		sid.manage().window().maximize();
		
		Thread.sleep(5000);
		
		sid.close();
	}

}
