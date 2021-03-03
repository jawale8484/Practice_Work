package collection_map;
import java.util.*;
public class Program_1 {
	public static void main(String[] args) {
		Map <Integer,String>map=new HashMap<Integer,String>();
		map.put(1,"vaibhav");
		map.put(2, "ghana");
		map.put(3, "sopil");
		
		System.out.println();
		
		Set set=map.entrySet();
		Iterator itr=set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		 
		
	
	}

}
