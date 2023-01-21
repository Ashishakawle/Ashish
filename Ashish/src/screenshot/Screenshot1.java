package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class Screenshot1 {

public static void main(String[] args) throws InterruptedException, IOException  {
		
		System.setProperty("webdriver.chrome.driver","C:\\installar\\chromedriver.exe");
		
		 WebDriver  driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		          File source =((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		          
		          System.out.println(source);
		          
		          File destination = new File("C:\\Users\\admin\\Desktop\\Screenshotsnew\\fbfir.jpg");
		          
   
		    org.openqa.selenium.io.FileHandler.copy(source, destination);
		         
}
}