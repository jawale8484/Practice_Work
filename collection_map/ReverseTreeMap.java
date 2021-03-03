package collection_map;

import java.util.Collections;

//14.	WAP to get a reverse order view of the keys contained in a given   TreeMap

import java.util.*;

public class ReverseTreeMap {
	public static void main(String[] args) {
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>(Collections.reverseOrder());
		tm.put(11, "Sumit");
		tm.put(14, "komal");
		tm.put(13, "sopil");
		tm.put(10, "madhu");
		tm.put(16, "priyanka");
		tm.put(15, "Vaibhav");
		for(Map.Entry<Integer,String> m:tm.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		//or using map.Descending(Map) Method
		//tm.descendingMap();
	}
}
