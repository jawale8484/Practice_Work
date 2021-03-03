//For practice

package collection_List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.*;
public class Array_list {

	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add(12);
		list.add(11);
		list.add(15);
		System.out.println(list);
		
		Iterator  itr= list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		itr.remove();;
		System.out.println(list);
		
		
		ArrayList<String> li=new ArrayList<String>();
		li.add("Vaibhav");
		li.add("ghama");
		li.add("nanu");
		li.add("madhu");
		System.out.println(li);
		for(String nm:li) {
			System.out.println(nm);
		}
		System.out.println(li);
		
		LinkedList <Integer>ll=new LinkedList<Integer>();
		for (int i = 0; i < 5; i++) {
			ll.add(i);
		}
		Collections.reverse(ll);
		System.out.println(ll);  //Using reverse method
		
		
		//using descendingIterator
		Iterator ite=ll.descendingIterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
		
		//Using listIterator
		ListIterator ltr=ll.listIterator(ll.size());
		while(ltr.hasPrevious()) {
			System.out.println(ltr.previous());
		}
		
	}

}
