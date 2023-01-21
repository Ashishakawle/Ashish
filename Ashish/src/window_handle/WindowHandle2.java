package window_handle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle2 {


	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\installar\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		String windowID= driver.getWindowHandle();
		System.out.println(windowID);
		
		//The getwindowhandle method is used to store the single window browser id
		
		driver.close();
}
}