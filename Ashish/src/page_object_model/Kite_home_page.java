package page_object_model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_home_page {
	

	public Kite_home_page(WebDriver driver) {
	
		PageFactory.initElements(driver, this);
	}
	
		
		@FindBy(xpath="//input[@id=\"userid\"]")
		
     	WebElement userid;
		
		@FindBy(xpath="//input[@id=\"password\"]")
		
		WebElement password;
		
		@FindBy(xpath="//button[@type=\"submit\"]")
		
		WebElement login;
		
		

		public void userid() {
			userid.sendKeys("GP8097");
		}
		
		public void password() {
			password.sendKeys("Swami@0110");
		}
		
		public void login() {
			login.click();
		}

}
