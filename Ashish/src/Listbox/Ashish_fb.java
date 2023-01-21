package Listbox;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Ashish_fb {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\installar\\chromedriver.exe");
            WebDriver driver=new ChromeDriver();
             driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
             driver.get("https://www.facebook.com/");
             Thread.sleep(1000);
             driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]")).click();
             Thread.sleep(1000);
             driver.findElement(By.name("firstname")).sendKeys("Ashish");
             Thread.sleep(1000);
             driver.findElement(By.name("lastname")).sendKeys("Kawale");
             Thread.sleep(1000);
             driver.findElement(By.xpath("//input[@name=\"reg_email__\"]")).sendKeys("9371834093");
             Thread.sleep(1000);
             driver.findElement(By.xpath("//input[@id=\"password_step_input\"]")).sendKeys("ashishjkesl");
             Thread.sleep(1000);
//             WebElement day=driver.findElement(By.xpath("//select[@id=\"day\"]"));
//             WebElement Month=driver.findElement(By.xpath("//select[@id=\"month\"]"));
//             WebElement Year=driver.findElement(By.xpath("//select[@id=\"year\"]"));
             
//             String dob="7/Jan/1992";
//             
//             String[]date=dob.split("/");
//             drowpdown(day,date[0]);
//             drowpdown(Month,date[1]);
//             drowpdown(Year,date[2]);
             
             WebElement day=driver.findElement(By.xpath("//select[@id=\"day\"]"));
             Select date=new Select(day);
             List<WebElement> tdate= date.getOptions();
             System.out.println(tdate.size());
            for(int i=0;i<tdate.size();i++) {
             String tdatev= tdate.get(i).getText();
             System.out.print(" "+tdatev);
             
       }    
            WebElement Month=driver.findElement(By.xpath("//select[@id=\"month\"]"));
            Select Amonth=new Select(Month);
            List<WebElement> tMonth= Amonth.getOptions();
            System.out.println(tMonth.size());
           for(int i=0;i<tMonth.size();i++) {
            String tMonthv= tMonth.get(i).getText();
            System.out.print(" "+tMonthv);
            
      }    
            
            Thread.sleep(3000);
            driver.close();
	}
// public static void drowpdown(WebElement element,String value) {
//	 Select SLT=new Select(element);
//	 SLT.deselectByVisibleText(value);
// }
// 
 
}
