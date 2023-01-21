package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getcurrent_url {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\installar\\chromedriver.exe");
		
		
	WebDriver driver =new ChromeDriver();
	
	   driver.get("https://www.google.com");
	   Thread.sleep(5000);
	   
	   String title= driver.getTitle();
	   String URL =driver.getCurrentUrl();
	   
	   System.out.println(title);
	   System.out.println(URL);
		
	   Thread.sleep(5000);
		driver.close();
	}
}
