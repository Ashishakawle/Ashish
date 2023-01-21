package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class ScreenshortGood {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\installar\\chromedriver.exe");
         WebDriver dr=new ChromeDriver();
         dr.get("https://www.google.co.in/");
         File source=((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
		    String Random = RandomString.make(2);
		    String file="Googale";
         File desti=new File(".\\Pechares\\"+file+""+Random+".jpg");
         FileHandler.copy(source, desti);
         
         
         dr.close();
	}

}
