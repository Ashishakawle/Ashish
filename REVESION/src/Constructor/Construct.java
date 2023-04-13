package Constructor;

public class Construct {
       String name;
       int no;

public Construct(String na,int roll) {
    super();		
    name=na;
    no=roll;
}
public static void main(String[] args) {
	Construct n1=new Construct("Ashish",21);
	Construct n2=new Construct("vaibhs",36);
	Construct n3=new Construct("bhavin",14);
	
	System.out.println(n1.name+" "+n1.no);
	System.out.println(n2.name+" "+n2.no);
System.out.println(n3.name+" "+n3.no);
}
public static void name() {
//	this.name;
}
}
