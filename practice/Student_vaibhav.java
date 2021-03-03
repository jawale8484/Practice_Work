package practice;

public class Student_vaibhav {

	int id;

	public Student_vaibhav(int id) {
		// TODO Auto-generated constructor stub
		this.id = id;
	}

}

class department {
	String name;
	int s;

	public department(String name, int i) {
		this.s = i;
		this.name = name;
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		department ob=new department("Computer Science", 10);
	}
}
