package screenshot;


import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;


public class Screenshot2 {
	

public static void main(String[] args) throws InterruptedException, IOException  {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\installer\\chromedriver.exe");
		
		 WebDriver  driver = new ChromeDriver();
		
		driver.get("https://www.Amazon.com/");
		Thread.sleep(2000);
		     
		   File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		   
		    String random =  RandomString.make(4);
		    String filename="amazon";
		   
		   File destination=new File(".\\storescreenshot\\"+filename+""+random+".jpg");
		
	     	FileHandler.copy(source, destination);
		
}
}
