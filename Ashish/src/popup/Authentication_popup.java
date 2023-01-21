package popup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authentication_popup {
		

		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver","C:\\installar\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver ();
			
		//   after https://username:password@ insert into get method	
					
	driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	
	Thread.sleep(3000);
		
	}

}
