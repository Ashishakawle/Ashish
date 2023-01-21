package action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Right_Click {
	
public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","C:\\installar\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver ();
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		Actions act=new Actions(driver);
	    WebElement button	=driver.findElement(By.xpath("//span[@class=\"context-menu-one btn btn-neutral\"]"));
		
		act.contextClick(button).build().perform(); //right lick on the element  (if we not use build that tie also action will perform)
		
		driver.findElement(By.xpath("//li[@class=\"context-menu-item context-menu-icon context-menu-icon-copy\"]")).click();
		
		System.out.println(driver.switchTo().alert().getText());
                  Thread.sleep(3000);
		driver.switchTo().alert().accept();
}
}