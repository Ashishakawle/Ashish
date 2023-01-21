package popup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Permission_popup {
	

	public static void main(String[] args) throws InterruptedException {
		//permission popup
		
		ChromeOptions option =new ChromeOptions();
		
		option.addArguments("--disable-notifications");
		
		
				
		System.setProperty("webdriver.chrome.driver","C:\\installar\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver (option);
		
		driver.get("https://www.cleartrip.com/");
		

}
}