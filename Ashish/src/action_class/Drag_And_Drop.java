package action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_And_Drop {

public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\installar\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver ();
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		Actions act=new Actions(driver);
		WebElement  source=driver.findElement(By.xpath("//div[@id=\"box3\"]"));
		
		WebElement target=driver.findElement(By.xpath("//div[@id=\"box102\"]"));
		
	//	act.clickAndHold(source).moveToElement(target).release().build().perform();
		
		act.dragAndDrop(source, target).build().perform();
		
		
		//note-build() and Perform() is used tocompile and execute the action class
		
}
}