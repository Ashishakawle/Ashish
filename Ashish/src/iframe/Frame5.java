package iframe;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Frame5 {
	

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","C:\\installar\\chromedriver_win32\\chromedriver.exe");
	ChromeOptions ops= new ChromeOptions();
    ops.addArguments("--remote-allow-origins=*");
	WebDriver driver=new ChromeDriver(ops);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://www.naukri.com/nlogin/login?URL=https://www.naukri.com/mnjuser/homepage");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@id=\"usernameField\"]")).sendKeys("ashishkawale095@gmail.com");
	driver.findElement(By.xpath("//input[@id=\"passwordField\"]")).sendKeys("ashishkawale2022");
	driver.findElement(By.xpath("//small[contains(text(),'Show')]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//button[@type=\"submit\" and @data-ga-track=\"spa-event|login|login|Save||||true\" ])")).click();
	Thread.sleep(1000);
	WebElement pro=driver.findElement(By.xpath("//div[@class='nI-gNb-bar1']"));
	pro.click();
	System.out.println("enter or not");
	
	Thread.sleep(4000);
	 driver.close();
}
}