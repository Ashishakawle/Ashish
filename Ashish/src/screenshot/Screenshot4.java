package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Screenshot4 {
	
	public static void main(String[] args) throws IOException {
				
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\installer\\chromedriver.exe");
		
		 WebDriver  driver = new ChromeDriver();
		
		driver.get("https://in.search.yahoo.com/");
		
	WebElement src=	driver.findElement(By.xpath("//span[@id=\"logo\"]"));
	
	  File source = ((TakesScreenshot) src).getScreenshotAs(OutputType.FILE);
	    
	 String random= RandomString.make(4);
	 String filename="yahoo1";
	  
	  File dest=new File(".\\storescreenshot\\"+filename+""+random+".jpg");
	  
		FileHandler.copy(source, dest);
		
	}

}
