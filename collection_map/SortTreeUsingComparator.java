package collection_map;
import java.util.*;
//11.	WAP to sort keys in TreeMap by using comparator
public class SortTreeUsingComparator {

	public static void main(String[] args) {
		TreeMap <Integer,String> tm=new TreeMap<Integer,String>(new com());
		tm.put(11, "Sumit");
		tm.put(14, "komal");
		tm.put(13, "sopil");
		tm.put(10, "madhu");
		tm.put(16, "priyanka");
		tm.put(15, "Vaibhav");
		System.out.println(tm);
	}
}
class com implements Comparator<Integer>{
	
	@Override
		public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return o1.compareTo(o2);
	}
	
}
