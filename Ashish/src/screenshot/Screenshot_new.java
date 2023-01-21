package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class Screenshot_new {

	public static <TakeScreenshots> void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\installar\\chromedriver.exe");
		
		 WebDriver  driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		String name="facebookfirst";
		File destination=new File("E:\\velocity_new\\storescreenshot"+name+".jpg");
		
		FileHandler.copy(source, destination);
		
	}
}
