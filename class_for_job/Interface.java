package class_for_job;

interface stud_1 {
	default void p1() {
		System.out.println("Stud_1 method");
	}
}
interface stud_2{
	default void p1() {
		System.out.println("Stud_2 method");
	}
}

class Interface implements stud_1,stud_2 {
	public void p1() {
		System.out.println("class methods--");
	}

	public static void main(String[] args) {
		Interface ob=new Interface();
		ob.p1();
	}
}
