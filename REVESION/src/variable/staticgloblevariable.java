package variable;

public class staticgloblevariable{
static int Test =30; //Static globl var 
static String java="asgsus";
String name= "ashish";
int roll=44;
	public static void main(String[] args) {
	System.out.println(staticgloblevariable.java);
	System.out.println(staticgloblevariable.Test);
 
	staticgloblevariable.ash();
	
	Different d=new Different();
	System.out.println(d.name);  
	System.out.println(d.Test);
	System.out.println(d.name1);
	System.out.println(d.Test1);
	}
	public static void ash() {
		Test=66;
		System.out.println(Test);
		System.out.println(java);
	}

}
