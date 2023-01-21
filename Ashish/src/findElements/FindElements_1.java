package findElements;







import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class FindElements_1 {
	
	
public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","C:\\installar\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);

		
         List<WebElement> links1 = driver.findElements(By.xpath("//a[@class=\"nav-a  \"]"));
         System.out.println(links1.size());
         
      //   for(int i=0; i<links1.size(); i++) {
        //	 System.out.println(links1.get(i).getText());
        // }
         
     for(WebElement obj:links1) {
    	 
    	 System.out.println(obj.getText());
     }
     //2.not through exception it will retreive 0 element
     List<WebElement> links2 = driver.findElements(By.xpath("//a[@class=\"na  \"]"));
     System.out.println(links2.size());
     
}
}