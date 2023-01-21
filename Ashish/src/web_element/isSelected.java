package web_element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelected {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\installer\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		Thread.sleep(4000);
	boolean b=	driver.findElement(By.xpath("//input[@value=\"Male\"]")).isSelected();
	
	System.out.println(b);
	
	driver.findElement(By.xpath("//input[@value=\"Male\"]")).click();
	Thread.sleep(3000);
 //   boolean c=driver.findElement(By.xpath("//input[@value=\"Male\"]")).isSelected();
  //  System.out.println(c);
	
	System.out.println(driver.findElement(By.xpath("//input[@value=\"Male\"]")).isSelected());
	
	driver.close();
		
}
}