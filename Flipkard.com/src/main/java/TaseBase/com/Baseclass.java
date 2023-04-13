package TaseBase.com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
   public static  WebDriver driver;
   public static Properties Props; 
   
   public Baseclass() {
	   try {
	   Props =new Properties();
	   FileInputStream File= new FileInputStream("G:\\A Projects\\Flipkard.com\\src\\main\\java\\DDRproperty\\config.properties");
	   Props.load(File);
	}catch (FileNotFoundException e) {
	
		e.printStackTrace();
	} catch (IOException e) {
		
		e.printStackTrace();
	 }
   }
   @SuppressWarnings("deprecation")
public void intialations() {
	   WebDriverManager.chromedriver().setup();
	   ChromeOptions opt= new ChromeOptions();
	   opt.addArguments("--remote-allow-origins=*");
	   driver=new ChromeDriver(opt);
	   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	   driver.manage().window().maximize();
	   driver.get(Props.getProperty("URL"));
   }
}
