package web_element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isEnable {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\installer\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://app.hubspot.com/login");
		
       boolean b= driver.findElement(By.xpath("//button[@id=\"loginBtn\"]")).isEnabled();
       
        System.out.println(b);
       
    boolean c= driver.findElement(By.xpath("//button[@id=\"loginBtn\"]")).isDisplayed();
       System.out.println(c);
       driver.close();
}
}