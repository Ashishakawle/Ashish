package web_Tables;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_table1 {

	public static void main(String[] args) throws InterruptedException {

		  System.setProperty("webdriver.chrome.driver","C:\\installar\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		
	WebElement text	=driver.findElement(By.xpath("//h3[contains(text(),'Example')]"));
		
	JavascriptExecutor js=(JavascriptExecutor) driver;
	Thread.sleep(2000);
	js.executeScript("arguments[0].scrollIntoView();",text);
		
		//how many rows ??
	Thread.sleep(2000);
int rowsize	=driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr")).size();
System.out.println(rowsize);

       //how many cell ??
  int cellsize = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr/th")).size();
  System.out.println(cellsize);
  
  //Retrive specific data row/column data
  
   String values   =driver.findElement(By.xpath("//table[@id=\"customers\"]/tbody/tr[7]/td[2]")).getText();
   System.out.println(values);
   
    List<WebElement> alldata = driver.findElements(By.xpath("//table[@id=\"customers\"]"));
    
    for(int i=0; i<alldata.size(); i++) {
    	
    String tabledata=alldata.get(i).getText();
    
    System.out.println(" "+tabledata);
  
    }
//     driver.quit();
	}

}
