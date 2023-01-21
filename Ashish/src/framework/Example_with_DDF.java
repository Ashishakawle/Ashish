package framework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Example_with_DDF {
	
@SuppressWarnings("deprecation")
public static void main(String[] args) throws EncryptedDocumentException, IOException  {

	ChromeOptions permission=new ChromeOptions();	
	permission.addArguments("--disable-notifications");
	
	System.setProperty("webdriver.chrome.driver","C:\\installar\\chromedriver.exe");
				
		WebDriver driver=new ChromeDriver(permission);
		
		driver.get("https://kite.zerodha.com/");
		
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		FileInputStream file=new FileInputStream("E:\\velocity_new\\storescreenshot\\19FebTeam.xlsx");
		
		      Sheet data =  WorkbookFactory.create(file).getSheet("Sheet1");
		      
		       String userID = data.getRow(0).getCell(0).getStringCellValue();
		       
		        String password= data.getRow(0).getCell(1).getStringCellValue();
		
	  driver.findElement(By.xpath("//input[@id=\"userid\"]")).sendKeys(userID);
		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys(password);	

	  driver.findElement(By.xpath("//button[@class=\"button-orange wide\"]")).click();
	  
	 String pinnum =  data.getRow(0).getCell(2).getStringCellValue();
	   
	   driver.findElement(By.xpath("//input[@id=\"pin\"]")).sendKeys(pinnum);
	  
	 driver.findElement(By.xpath("//button[contains(text(),'Continue')]")).click();
	 
	
	 String expectedresult="GP8097";
	 
	String actualresult =driver.findElement(By.xpath("//span[contains(text(),'GP8097')]")).getText();
	
	if(actualresult.equals(expectedresult)) 
		System.out.println("pass");
	
	else
		System.out.println("fail");
}
}