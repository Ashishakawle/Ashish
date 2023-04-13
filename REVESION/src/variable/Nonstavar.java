package variable;

public class Nonstavar {
    String name= "ashish";
    int roll=44;
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
	 Nonstavar n=new Nonstavar();
		System.out.println(n.name);
		System.out.println(n.roll);
		staticgloblevariable v=new staticgloblevariable();
//		v.ash();
		System.out.println(v.java);
		System.out.println(v.Test);
		n.test();
	}
 public void test() {
//	 int roll=400;
	 System.out.println(name);
	 System.out.println(roll);
 }

}
