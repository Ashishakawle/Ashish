package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_upload2 {
	

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\installer\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver ();
		
		driver.get("https://the-internet.herokuapp.com/upload");
		Thread.sleep(4000);

	driver.findElement(By.xpath("//input[@id=\"file-upload\"]")).sendKeys("E:\\Testing\\Automation testing\\WhatsApp Image 2022-02-23 at 10.40.53 PM.jpeg");
}
}