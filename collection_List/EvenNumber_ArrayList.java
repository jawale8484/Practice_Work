//7.	WAP to add 1 to 50 numbers in ArrayList and print only even numbers (using iterator)
package collection_List;

import java.util.*;

public class EvenNumber_ArrayList {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		for (int i = 1; i <= 50; i++) {
			list.add(i);
		}
		
		//Using iterator
		System.out.println("Even number within 1 to 50-");
		Iterator itr=list.iterator();
		while(itr.hasNext()) {
			int num=(int) itr.next();
			if(num%2==0) {
				System.out.print(num+" ");
			}
		}
	}

}
