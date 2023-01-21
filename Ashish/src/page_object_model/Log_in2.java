package page_object_model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Log_in2 {

	public Log_in2(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	
	
	@FindBy(xpath="//input[@id=\"pin\"]")
	
	WebElement pin;
	
	@FindBy(xpath="//button[@class=\"button-orange wide\"]")
	
	WebElement cont;
	
	
	
	public void pin() {
		pin.sendKeys("449192");
	}
	
	public void cont() {
		cont.click();
	}
}
