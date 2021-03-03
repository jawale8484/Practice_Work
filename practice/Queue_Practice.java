package practice;
import java.util.*;

class Emp{
	int id;
	String name;
	public Emp(int id,String name) {
		this.id=id;
		this.name=name;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + "]";
	}
	
}

public class Queue_Practice {

	public static void main(String args[]) {
		Queue q=new PriorityQueue();
		q.add(new Emp(11,"vaibhav"));
		System.out.println(q);
	}
}
