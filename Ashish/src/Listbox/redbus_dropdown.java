package Listbox;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class redbus_dropdown {
	
	
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\installar\\chromedriver.exe");
				
				WebDriver driver=new ChromeDriver ();
				
				driver.get("https://m.redbus.in/");
				Thread.sleep(3000);

	}	
}