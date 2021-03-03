//Containment program by creating array of object
package array_practice;
import java.util.*;
class Dept{
	 int d_id;
	 String d_name;
	public Dept(int d_id,String d_name) {
		// TODO Auto-generated constructor stub
		this.d_id=d_id;
		this.d_name=d_name;
	}
}
class Mydate{
	int day,month,year;
	Mydate(int day,int month,int year){
		this.day=day;
		this.month=month;
		this.year=year;
	} 
}
public class EmployeeAsArray  {
	static	int emp_id;
	static String emp_name;
	 Dept od;Mydate md;
	public EmployeeAsArray(int emp_id,String emp_name,Dept od,Mydate md) {
		this.emp_id=emp_id;
		this.emp_name=emp_name;
		this.od=od;
		this.md=md;
	}
	void display() {
		System.out.println("Department Id->"+od.d_id);
		System.out.println("Department name->"+od.d_name);
		System.out.println("Date->"+md.day+"/"+md.month+"/"+md.year);
		System.out.println("Employee Id->"+emp_id);
		System.out.println("Employee name->"+emp_name);
		System.out.println();
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of Employees for details");
		int num=sc.nextInt(); 
		EmployeeAsArray arr[]=new  EmployeeAsArray[num];
		for(int i=0;i<arr.length;i++) {
			//Enter details of employyes
			System.out.println("Enter employee id");
			int eid=sc.nextInt();
			System.out.println("Enter employee name");
			String enm=sc.next();
			arr[i]=new EmployeeAsArray
					(eid, enm, new Dept(101, "MCA"), new Mydate(01, 01, 2020));
//			arr[i]=new EmployeeAsArray
//					(11, "Vaibhav", new Dept(101, "MCA"), new Mydate(01, 01, 2020));
			arr[i].display();
			
		}
		
	}
}
