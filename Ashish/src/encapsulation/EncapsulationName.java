package encapsulation;

public class EncapsulationName {
    private int idno;
	private String name;
	private int age;
	private String Lastname;
	
public static void main(String[]args) {
	EncapsulationName AS= new EncapsulationName();    
	   AS.setAge(29);
	   AS.setIdno(101);
	   AS.setName("ashish");
	   AS.setLastname("kawale");
	   
	   System.out.println(AS.getName());
	   System.out.println(AS.getName());
	   System.out.println(AS.getIdno());
	   System.out.println(AS.getAge());
	   
	}

public int getIdno() {
	return idno;
}

public void setIdno(int idno) {
	this.idno = idno;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public String getLastname() {
	return Lastname;
}

public void setLastname(String lastname) {
	Lastname = lastname;
}
	
	
}
