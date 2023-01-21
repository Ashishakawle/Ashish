package Webelement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methgod_webelement {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\installar\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("");
		
		
		
		
	}

}
