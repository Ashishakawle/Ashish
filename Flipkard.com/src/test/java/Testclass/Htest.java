package Testclass;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Pomclass.Homepage;
import TaseBase.com.Baseclass;

public class Htest extends Baseclass {	
	Homepage hm;
public Htest() {
	super();
}
@BeforeSuite
public void setup() {
	intialations();
 hm=new Homepage();
}
@Test
public void LPage() throws InterruptedException {
	 hm.Lpage(Props.getProperty("Name"), Props.getProperty("Lname"), 
	Props.getProperty("Address"), Props.getProperty("Email"), Props.getProperty("Mobile"));
}
 @Test
 public void test1(){
   hm.list();
}

@AfterSuite
public void teardown() {
	driver.quit();
}
}
