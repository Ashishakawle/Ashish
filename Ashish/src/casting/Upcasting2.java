package casting;

public class Upcasting2 extends Upcasting{
	
	public static void main(String[] args) {
		
		
		
		Upcasting2 sss=new Upcasting2();
		
		sss.m1();
		sss.m2();
		
		Upcasting2 aa= (Upcasting2) new Upcasting();
		
	aa.m1();
	aa.m2();
		
	}

	public void m2() {
		System.out.println("hello java");
		
	}
	
}
