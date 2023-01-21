package encapsulation;

public class Diff_Class {
	
	public static void main(String[] args) {
		
		Employee_data emp=new Employee_data();
		
		emp.setName("Virat");
		emp.setAge(30);
		emp.setPin(1818);
		
		System.out.println(emp.getName());
		System.out.println(emp.getAge());
		System.out.println(emp.getPin());
		
	}

}
