package Demo;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSize {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\installar\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		System.out.println(driver.manage().window().getSize());
		
		Dimension d=new Dimension(300,500);
		System.out.println(d);
		
		driver.manage().window().setSize(d);
		
		System.out.println(driver.manage().window().getSize());
		
		driver.close();
	}

}
