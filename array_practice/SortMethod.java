//Sort array using method
package array_practice;

import java.util.Arrays;
import java.util.Scanner;

public class SortMethod {
	public static void main(String[] args) {
		int arr[]= {30,20,10,60,50};
		System.out.println("Unsorted array-->");
		for(int i:arr) 
			System.out.print(i+" ");
		
			System.out.println("\n Sorted array-->");
			Arrays.sort(arr);
			
			for(int i:arr)
				System.out.print(i+" ");
			
			
			
			
			
	}
}
