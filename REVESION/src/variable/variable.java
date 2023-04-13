package variable;

public class variable {

	public static void main(String[] args) {
//1 var .dec & initialazation
	String firstname= "ashish";
	String lastname= "kawale";
	
	System.out.println(firstname);
	System.out.println(lastname);
	variable v=new variable();
	v.test();
	v.test1();
	   
	}
	public void test () {
		int Name=40;
//	static int name=66; -Not allowed
		System.out.println(Name);
	}
 public void test1() {
	 int rollno=30;
//	 System.out.println(Name);
	 System.out.println(rollno);
 }
 /*types of variables
  1.Local Varibles -non static local var
  2. Globle variables -1 Static/class globle var
                       2. Non static/instance globle var 
  */
}
