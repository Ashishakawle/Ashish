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

public class Screenshot5 {
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\installer\\chromedriver.exe");
		
		 WebDriver  driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
	WebElement sss	=driver.findElement(By.xpath("//h2[@class=\"_8eso\"]"));
		
	  File sourse= ((TakesScreenshot) sss).getScreenshotAs(OutputType.FILE);
	  
	  String filename ="fbloginpage";
	  
	  File destination =new File(".\\storescreenshot\\"+filename+".jpg");
	  
		FileHandler.copy(sourse, destination);
	}

}
