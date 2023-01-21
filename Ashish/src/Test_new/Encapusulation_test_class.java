package Test_new;

import encapsulation.Employee_data;

public class Encapusulation_test_class {
	
	public static void main(String[] args) {
		
		Employee_data ed1=new Employee_data();
		
		ed1.setName("arav");
		ed1.setAge(20);
		ed1.setPin(1212);
		
		System.out.println(ed1.getName());
		System.out.println(ed1.getAge());
		System.out.println(ed1.getPin());
		
		
	}
}
