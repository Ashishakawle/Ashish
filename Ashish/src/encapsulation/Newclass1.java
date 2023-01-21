package encapsulation;

public class Newclass1 {

private String Lname;
   private int rollno;
   private String Branch;
	public static void main(String[] args) {
		Newclass1 nm=new Newclass1();
            nm.setName("Ashish");
            nm.setLname("kawale");
            nm.setRollno(10);
            nm.setBranch("Mechanical");
            System.out.println("Name:-"+nm.getName());
            System.out.println("Last name:-"+nm.getLname());
            System.out.println("Rollno:-"+nm.getRollno());
            System.out.println("Branch:-"+nm.getBranch());
	}
	   private String Name;
	   public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getLname() {
		return Lname;
	}
	public void setLname(String lname) {
		Lname = lname;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getBranch() {
		return Branch;
	}
	public void setBranch(String branch) {
		Branch = branch;
	}
}
