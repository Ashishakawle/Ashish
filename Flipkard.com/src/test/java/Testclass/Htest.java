package Testclass;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Pomclass.Homepage;
import TaseBase.com.Baseclass;
import Utility.Utility;

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
public void teardown(ITestResult Result) throws IOException {
	if(ITestResult.FAILURE== Result.getStatus()) {
		Utility.pichture(driver,Result.getName());
	System.out.println(" testcases fail screenshort is done ");	} 
	
	driver.quit();
} 
}
