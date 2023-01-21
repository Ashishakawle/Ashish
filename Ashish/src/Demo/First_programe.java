package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class First_programe {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\installar\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com");
		
	}

}

