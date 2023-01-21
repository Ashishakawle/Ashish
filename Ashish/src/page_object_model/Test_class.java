package page_object_model;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test_class {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\installer\\chromedriver.exe");
		
   ChromeOptions option=new ChromeOptions();
   option.addArguments("--disable-notifications");

		WebDriver driver=new ChromeDriver (option);
		
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS)	;
		
		driver.get("https://kite.zerodha.com/");
		
		Kite_home_page kh=new Kite_home_page(driver);
		
		kh.userid();
		kh.password();
		kh.login();
		
		Log_in2 kh2=new Log_in2(driver);
		
		kh2.pin();
		kh2.cont();
		
		
		
	}

}
