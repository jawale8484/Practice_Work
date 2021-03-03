//Display Duplicate Elements in array
package array_practice;

import java.io.*;
import java.util.*;

public class DisplayDuplicateElements {
	public static void main(String vaibhav[]) {
		int arr[]= {1,2,2,3,4,4,5,6,6,7,8,9,9,10};
		System.out.println("Array Elemets are-->");
		for(int i:arr)
			System.out.print(i+" ");
		
		System.out.println();
		
		//Display duplicate elements
		int j=0;
		for (int i = 0; i < arr.length-1; i++) {
			if(arr[i]==arr[i+1]) {
				arr[j]=arr[i];
				j++;
			}
		}
		System.out.println("Duplicates elemets->"+j);
		System.out.println("Display duplicate Elemets-->");
		for (int i = 0; i < j; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
