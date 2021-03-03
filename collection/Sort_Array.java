//Convert array into ArrayList and sort the elements
package collection;

import java.util.*;

public class Sort_Array {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		
		int arr[]=new int[size];
		System.out.println("Enter Elements-->");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("array is");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("conver into collection");
		
		//Collection
		ArrayList list=new ArrayList();
		
		for (int i = 0; i < arr.length; i++) {
			list.add(arr[i]);
		}
		System.out.println(list);
		Collections.sort(list);
		System.out.println("After sorting..");
		System.out.println(list);
		
		
	}
}
