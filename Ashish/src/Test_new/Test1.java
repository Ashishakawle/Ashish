package Test_new;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		String expectedresult="Facebook";
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\installer\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		Thread.sleep(5000);
		 String title =driver.getTitle();
		System.out.println(title);
	
	String url	=driver.getCurrentUrl();
	System.out.println(url);
	
	if(title.equals(expectedresult)) {
		System.out.println("correct result");
	}
	else {
		System.out.println("incorrect result");
	}
	
	driver.navigate().to("https://www.amazon.com");
	Thread.sleep(5000);
	
	String title1=driver.getTitle();
	System.out.println(title1);
	
	  String url1 =driver.getCurrentUrl();
	  System.out.println(url1);
	
	driver.navigate().back();
	Thread.sleep(3000);
	
	driver.navigate().refresh();
	driver.navigate().forward();
	Thread.sleep(3000);
	
		driver.close();
		
	}

}
