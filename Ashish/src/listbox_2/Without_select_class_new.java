package listbox_2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Without_select_class_new {
	

 static WebDriver driver;

public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","C:\\installar\\chromedriver.exe");
		
		  driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[contains(@id,\"u_0_2_\")]")).click();
		
		Thread.sleep(3000);
		
		       String days_xpath  = "//select[@id=\"day\"]//option";
		       String month_xpath  = "//select[@id=\"month\"]//option";
		       String years_xpath  = "//select[@id=\"year\"]//option";
		   
		       String dob="7-May-1995";
		      String []arr =dob.split("-");
		   
		      dropdown(days_xpath,arr[0]);
              dropdown(month_xpath, arr[1]);
              dropdown(years_xpath, arr[2]);
		
}
public static void dropdown(String xpathvalue,String values) {
	
	 List<WebElement> select = driver.findElements(By.xpath(xpathvalue));
	 System.out.println(select.size());
	 
	 for(int z=0; z<select.size(); z++) {
		 System.out.println(select.get(z).getText());
		 
		 if(select.get(z).getText().equals(values)) {
			 select.get(z).click();
		 }
	 }
	 
}


}