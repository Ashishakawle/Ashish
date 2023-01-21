package window_handle;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandle1 {
	
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\installer\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
	
		
	       String windowID =driver.getWindowHandle();	
	         System.out.println(windowID);//CDwindow-420D88E3B372305F639D0D7509DC8217
	         
	         driver.close();
	       System.out.println(windowID);  //CDwindow-4FAB959F5F4FC0AA7CECCDAEA98D790A
		
	}

}
