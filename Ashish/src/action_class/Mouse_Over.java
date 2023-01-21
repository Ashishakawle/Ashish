package action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Over {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\installar\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver ();
		Thread.sleep(2000);
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id=\"txtUsername\"]")).sendKeys("Admin");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id=\"txtPassword\"]")).sendKeys("admin123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id=\"btnLogin\"]")).click();
		Thread.sleep(3000);
		Actions act=new Actions(driver);
		Thread.sleep(3000);
	 WebElement admin=driver.findElement(By.xpath("//a[@id=\"menu_admin_viewAdminModule\"]"));	
	 Thread.sleep(2000);
	 WebElement usermanagement = driver.findElement(By.xpath("//a[@id=\"menu_admin_UserManagement\"]")); 
	 Thread.sleep(2000);
	 WebElement users=driver.findElement(By.xpath("//a[@id=\"menu_admin_viewSystemUsers\"]"));
	
		act.moveToElement(admin).build().perform();//mouse over to admin tab
		act.moveToElement(usermanagement).build().perform();//mouse over to usermanagement
		act.moveToElement(users).click().build().perform();
		
//		instead of writing three statement we can write one statement
		
		act.moveToElement(admin).moveToElement(usermanagement).moveToElement(users).click().build().perform();
		
	}

}
