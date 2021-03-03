//Print odd even and positive and negative elements in array
package array_practice;

import java.util.*;

public class PosNegOddEven {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of array-->");
		int size = sc.nextInt();

		int arr[] = new int[size];
		System.out.println("Enter Array elements-->");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Array Elements are-->");
		for(int i:arr)
			System.out.println(i);
		
		//Positive integer
		System.out.println("Positive integer-->");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>0)
				System.out.print(arr[i]+" ");
		}
		System.out.println();
		//negative integer
		System.out.println("Negative integer-->");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<0)
				System.out.print(arr[i]+" ");
		}
		System.out.println();
		//Odd Even Number  -->	
		System.out.println("Odd  Integer-->");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0)
				System.out.print(arr[i]+" ");
			
		}
		System.out.println();
		
		//Odd Even Number  -->	
				System.out.println("Even  Integer-->");
				for(int i=0;i<arr.length;i++) {
					if(arr[i]%2==0)
						System.out.print(arr[i]+" ");
					
				}
	}

}
