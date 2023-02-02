package Pomclass;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import TaseBase.com.Baseclass;

public class Homepage extends  Baseclass {
  public  Homepage() {
	  PageFactory.initElements(driver,this);
  }
  @FindBy(xpath = "//input[@placeholder='First Name']")
  WebElement name;
  @FindBy(xpath ="//input[@placeholder=\"Last Name\"]")
  WebElement lname;
  @FindBy(xpath ="//textarea[@ng-model=\"Adress\"]")
  WebElement Add;
  @FindBy(xpath = "//input[@type='email']")
  WebElement email;
  @FindBy(xpath = "//input[@type='tel']")
  WebElement Mno;
  @FindBy(xpath = "//input[@value='Male']")
  WebElement Mbtn;
  @FindBy(xpath = "//input[@id='checkbox2']")
  WebElement Hbtn ;
  @FindBy(xpath = "//div[@id=\"msdd\"]")
  WebElement lang;
  @FindBy(xpath = "//a[normalize-space()='English']")
  WebElement eng;
   
 public void Lpage(String nam, String ln ,String ad ,String em ,String MO ) throws InterruptedException {
	name.sendKeys(nam);
	Thread.sleep(1000);
	lname.sendKeys(ln);
	Thread.sleep(2000);
	Add.sendKeys(ad);
	Thread.sleep(1000);
	email.sendKeys(em);
	Thread.sleep(1000);
	Mno.sendKeys(MO);
	Mbtn.click();
	Hbtn.click();	
}
  public void list() {  
//	  eng.click();
	List<WebElement> listlng =driver.findElements(By.xpath( "//select[@id=\"Skills\"]/option"));
	 System.out.println(listlng.size());
	for(int i=0;i<=listlng.size()-1;i++) {
	String elelt=listlng.get(i).getText();
	 System.out.print(elelt);
	}
//	for(WebElement obj:listlng) {
//		String name=obj.getText();
//		System.out.print(name);
//	}
//	int size=listlng.size();
//	System.out.println(size);
//	for(WebElement abc:listlng) {
//		String text=abc.getText();
//		System.out.print(text+" ");
//	}
	
	}
}
