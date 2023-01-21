package casting;

public class Explicit {

	public static void main(String[] args) {
	
		//Higher datatype is converted into lower
		double d=10.4d;
		System.out.println(d);
		
		int x=(int) d;
		System.out.println(x);
		
		float f=23.4f;
		System.out.println(f);
		
		int b=(int) f;
		System.out.println(b);
		
	}
}
