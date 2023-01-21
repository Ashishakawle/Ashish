package multiple_links;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_Links {



	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
	
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\installer\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.in/");
		
	//	driver.findElement(By.xpath("//a[contains(text(),'Mobiles')]")).click();
		
		//How many Links are present on webpage ??
		
	List<WebElement> links	=driver.findElements(By.tagName("a"));
	
	System.out.println("total Links :"+links.size());
	
	//Print all the links
	
	for(WebElement web: links) {
		System.out.println(web.getText());
		System.out.println(web.getAttribute("href"));
		
		
	}
	
	}		
}
