package web_Tables;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_table2 {
	

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
	
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\installer\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		WebElement text	=driver.findElement(By.xpath("(//h3[contains(text(),'Example')])[1]"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",text);
		
       List<WebElement> row = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr"));
		System.out.println(row.size());
	
    	List<WebElement> column	=driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr/th"));
	   System.out.println(column.size());
	   
	 //Rtetrive specific row/cell data
	   String values   =driver.findElement(By.xpath("//table[@id=\"customers\"]/tbody/tr[7]/td[2]")).getText();
	   System.out.println(values);
	
	   //Retrive all data from the table
	  
	   
	   for(int i=2; i<=row.size(); i++) {
		   
		for(int j=1; j<=column.size();j++) {
			
			String  data = driver.findElement(By.xpath("//table[@id=\"customers\"]/tbody/tr[" +i+ "]/td[" +j+ "]")).getText()+" | ";
			
			System.out.print(data);
		}
		System.out.println();
	   }
	driver.quit();
	
  }
}