package Demo;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Set_position {
	
public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","C:\\installar\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.google.com");
			
			Point p=new Point(400, 500);
			
			driver.manage().window().setPosition(p);
			
			Thread.sleep(3000);
			
			System.out.println(driver.manage().window().getPosition());
			Thread.sleep(3000);

			driver.close();
}
}