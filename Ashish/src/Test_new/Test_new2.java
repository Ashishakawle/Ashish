package Test_new;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_new2 {
	
	public static void main(String[] args) {
		
		String expectedresult="Gooogle";
	System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\installer\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		  String title=driver.getTitle();
		  System.out.println(title);
		  
		  if(title.equals(expectedresult)) {
			  System.out.println("correct result");
		  }
		  else {
			  System.out.println("wrong result");
		  }
		
		driver.close();
	}

}
