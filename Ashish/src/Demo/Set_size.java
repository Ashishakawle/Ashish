package Demo;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Set_size {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\installer\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.google.com");
			
			Dimension size=new Dimension(200, 200);
			Thread.sleep(3000);
			
			driver.manage().window().setSize(size);
			
			driver.close();
			
			
			
	}
}
