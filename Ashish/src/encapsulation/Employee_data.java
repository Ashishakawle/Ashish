package encapsulation;

public class Employee_data {
	
private  int pin;
private  String name;
private	int age;

	public static void main(String[] args) {
	
		Employee_data ed=new Employee_data();
		
	ed.setName("siddhesh");
	ed.setAge(27);
	ed.setPin(1993);
	
	System.out.println(ed.getName());
	System.out.println(ed.getAge());
	System.out.println(ed.getPin());
		
		
		
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
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

}
