package synchronization;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicit_wait {
	

public static void main(String[] args)  {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\installer\\chromedriver.exe");
		
		WebDriver  driver = new ChromeDriver();
		
		driver.manage().window().maximize();
	//	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.redbus.in/");
		
		driver.findElement(By.xpath("//input[@id=\"src\"]")).sendKeys("Pune");
		
		
	List<WebElement>  cityfrom	=driver.findElements(By.xpath("//ul[@class=\"autoFill homeSearch\"]//li"));
	
	System.out.println(cityfrom.size());
	
	for(int i=0; i<cityfrom.size(); i++) {
		System.out.println(cityfrom.get(i).getText());
		
		if(cityfrom.get(i).getText().equals("Railway Station, Pune")) {
			cityfrom.get(i).click();
			break;
		}
	}
	
}


}
