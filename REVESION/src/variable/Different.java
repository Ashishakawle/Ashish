package variable;

public class Different {
int Test=99;
String name="Vaibhs";
static int Test1=88; 
static String name1="bhalla";
public static void main(String[] args) {
	Different d=new Different();
	d.Lnam();
	d.nam();
	
}
public static void nam() {
	
  System.out.println(name1);
  System.out.println(Test1);
}
public void Lnam() {
	System.out.println(Different.Test1);
	System.out.println(Different.name1);
}
}
