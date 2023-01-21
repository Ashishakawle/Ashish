package Test_new;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\installer\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		 String d=driver.getTitle();//1.title
		 System.out.println(d);
		 
	     String url	 =driver.getCurrentUrl();//2.url
	     System.out.println(url);
	     
	     driver.manage().window().maximize();//3.maximize
	     
	     Dimension di=new Dimension(300, 500);//4.setsize
	     driver.manage().window().setSize(di);;
	     
	     System.out.println(driver.manage().window().getSize());//5.getsize
	       
	     Point p=new Point(300,500);
	     driver.manage().window().setPosition(p);//6.setposition
	     
	     System.out.println(driver.manage().window().getPosition());//7.getposition
	     
	     driver.navigate().to("https://www.Amazon.com/");//8.navigate
	     
	     driver.navigate().forward();
	     driver.navigate().back();
	     driver.navigate().refresh();
		
		 driver.close();//9.close
	}
}
