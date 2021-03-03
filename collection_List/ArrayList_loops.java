//Iterate Using all loops
package collection_List;
import java.util.*;
public class ArrayList_loops {

	public static void main(String args[]) {
		ArrayList<String> list=new  ArrayList<String>();
		list.add("Vaibhav");
		list.add("Kishor");
		list.add("Jawale");
		System.out.println(list);
		
		
		
		//using iterator
		System.out.println("Using iterator-");
		Iterator itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//using for loop
		System.out.println("\nUsing For loop");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		//Using for each loop
				System.out.println("\nUsing For-Each loop--");
				for(String s:list) {
					System.out.println(s);
				}
				
		//Using for-Each lambda Expression
			System.out.println("\nFor Each Lambda Expression-");
			list.forEach(s->{
				System.out.println(s);
			});
			
		
	}

}
