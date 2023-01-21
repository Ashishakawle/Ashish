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

public class Sreenshot3 {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\installer\\chromedriver.exe");
		
		 WebDriver  driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
	WebElement src	=driver.findElement(By.xpath("//img[@class=\"fb_logo _8ilh img\"]"));
		
		   File source = ((TakesScreenshot) src).getScreenshotAs(OutputType.FILE);
		   
		      String random = RandomString.make(10);
		      
		      String filename="facebook";
		   
		   File destination=new File("E:\\velocity_new\\src\\screenshots\\"+filename+""+random+".jpg");
		   
		   FileHandler.copy(source, destination);
		
		
		
	}
}
