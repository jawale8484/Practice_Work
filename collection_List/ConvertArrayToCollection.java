//10.	WAP to convert collection into array
package collection_List;
import java.util.*;
public class ConvertArrayToCollection {
	public static void main(String[] args) {
		ArrayList <Integer> list=new ArrayList<Integer>();
		list.add(11);
		list.add(12);
		list.add(13);
		list.add(14);
		list.add(15);
		//print collection
		
		System.out.println(list);
		System.out.println("After converting into array-");
		//create array an convert collection into array
		Object[] arr=list.toArray();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
			
		}
	}
}
