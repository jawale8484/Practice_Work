//Has-A relationship(containment)
package class_for_job;

class department {
	int id;
	String d_name;
	public department(int id,String d_name) {
		this.d_name=d_name;
		this.id=id;
	}
}

public class Containment_student {
	int roll_no;
	String name;
	department dp;

	public Containment_student(int roll_no, String name, department dp) {
		this.dp=dp;
		this.roll_no = roll_no;
		this.name = name;
	}
	 void display(){
		 System.out.println("Departments Id->"+dp.id+"\n Departments name->"+dp.d_name);
		System.out.println("Student Roll No->"+roll_no+"\n Student Name->"+name);
		
	}
	
	public static void main(String[] 
			args) {
		Containment_student ob=new Containment_student(12, "Vaibhav", new department(101,"Computer Science"));
		ob.display();
	}
}
