package framework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class With_DDF {
	
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		ChromeOptions permission=new ChromeOptions();	
		permission.addArguments("--disable-notifications");
			

		System.setProperty("webdriver.chrome.driver","C:\\installar\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver(permission);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
		driver.get("https://kite.zerodha.com/");
		
		FileInputStream file=new FileInputStream("E:\\velocity_new\\storescreenshot\\19FebTeam.xlsx");
		
	   Sheet data = WorkbookFactory.create(file).getSheet("Sheet1");
		
	
	    String username =data.getRow(0).getCell(0).getStringCellValue(); 
		driver.findElement(By.xpath("//input[@id=\"userid\"]")).sendKeys(username);
		
		 String password = data.getRow(0).getCell(1).getStringCellValue();
		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys(password);
		
		driver.findElement(By.xpath("//button[@class=\"button-orange wide\"]")).click();
		     
      String pin=data.getRow(0).getCell(2).getStringCellValue();
	   driver.findElement(By.xpath("//input[@id=\"pin\"]")).sendKeys(pin);
	  driver.findElement(By.xpath("//button[@class=\"button-orange wide\"]")).click();
	  
	  JavascriptExecutor js=(JavascriptExecutor) driver;
	  
	WebElement text = driver.findElement(By.xpath("(//button[@class=\"button-blue\"])[1]"));
	  js.executeScript("arguments[0].scrollIntoView()",text);
	  
	String actualresult="GP8097";
	 String expectedresult =driver.findElement(By.xpath("//span[contains(text(),'GP8097')]")).getText();
	 
	 if(expectedresult.equals(actualresult))
		 System.out.println("pass");
	 else
		 System.out.println("fail");
	}

}
