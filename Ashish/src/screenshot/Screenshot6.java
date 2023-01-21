package screenshot;


import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import net.bytebuddy.utility.RandomString;

public class Screenshot6 {
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\installer\\chromedriver.exe");
		
		 WebDriver  driver = new ChromeDriver();
		 
		 driver.get("https://www.instagram.com/");
		 
		 File source  =  ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		      
		String random = RandomString.make();//name automatic change
		 String filename="instalogin";//name screenshot
		File dest=new File("C:\\Users\\admin\\Desktop\\Screenshotsnew\\"+filename+random+".jpg");//path+filename+jpg
		 
       FileHandler.copy(source, dest);
}
}