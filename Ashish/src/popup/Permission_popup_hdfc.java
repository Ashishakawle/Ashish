package popup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Permission_popup_hdfc {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeOptions permission=new ChromeOptions();
		
		permission.addArguments("--disable-notifications");
				
		System.setProperty("webdriver.chrome.driver","C:\\installar\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver (permission);
		
		Thread.sleep(3000);
		driver.get("https://www.hdfcbank.com/");
			
		//driver.switchTo().alert().accept();
		
	}

}
