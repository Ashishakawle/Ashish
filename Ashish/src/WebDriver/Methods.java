package WebDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Methods {
      @SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\installar\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		     
          driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(05,TimeUnit.SECONDS);
//		driver.get("https://www.google.com/");
	   String url =driver.getCurrentUrl();	 
	   System.out.println(url);
	   
//	    Dimension D= new Dimension(300, 500);
//	    driver.manage().window().setSize(D);
	    
//	   System.out.println(driver.manage().window().getSize());
//	   Point P=new Point(300, 400);
//	   driver.manage().window().setPosition(P);
//	   
//	   System.out.println(driver.manage().window().getPosition());
	   driver.navigate().to("https://www.google.com/");
	   driver.navigate().refresh();
	   driver.navigate().forward();
	   driver.navigate().back();
	   
	   Thread.sleep(3000);
//		driver.close();
	   driver.quit();
	}
}
