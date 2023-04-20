package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Npro95 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\installar\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10 ,TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[@id=\"login_Layer\"]")).click();
        Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder=\"Enter your active Email ID / Username\"]")).sendKeys("ashishkawale095@gmail.com");

		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("ashishkawale2022"); 

		driver.findElement(By.xpath("//span[@class=\"showhide blue-text\"]")).click();

		driver.findElement(By.xpath("//button[contains(text(),'Login')and@type=\"submit\"]")).click();

		driver.findElement(By.xpath("//div[@class=\"nI-gNb-drawer\"]")).click();

		driver.findElement(By.xpath("//a[contains(text(),'View & Update Profile')]")).click();
		
		WebElement resume=driver.findElement(By.id("attachCV"));
		 Thread.sleep(2000);
		resume.sendKeys("C:\\Users\\Admin\\Desktop\\ALL be software testing\\7972408941\\(Ashishkawale).pdf");

		Thread.sleep(5000);
		driver.close();

	}

}
