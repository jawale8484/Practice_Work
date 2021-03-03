package collection_set;
import java.util.*;
import java.lang.*;
public class Hashset_TO_Array {
	public static void main(String args[]) {
		HashSet set=new HashSet();
		for(int i=0;i<=5;i++) {
			set.add(i);
		}
		System.out.println(set);
		Object arr[]=set.toArray();
		
		for(Object i:arr)
		System.out.print(i+" ");
	}
}
