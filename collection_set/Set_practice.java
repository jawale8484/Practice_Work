package collection_set;
import java.util.*;
import java.lang.*;
public class Set_practice {
	public static void main(String args[]) {
		HashSet set=new HashSet();
		set.add(12);
		set.add("Vaibhav");
		set.add(null);
		System.out.println(set);
		set.add(12);			//duplicates are not allowed.
	}

}
