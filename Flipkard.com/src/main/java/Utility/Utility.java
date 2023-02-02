package Utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;


public class Utility {
 public static WebDriver driver;
	public static void pichture(WebDriver driver,String image) throws IOException {
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		String Random=RandomString.make(2);
		File dest=new File("./Sc/ "+image+".png");
		FileHandler.copy(source, dest);
 }
	public static void threadsleep() throws InterruptedException {
		Thread.sleep(2000);
	}
}
