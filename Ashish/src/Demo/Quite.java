package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Quite {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\installar\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Windows.html");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//button[@class=\"btn btn-info\"]")).click();
		
		Thread.sleep(5000);
		
		driver.quit();
		
	}

}
