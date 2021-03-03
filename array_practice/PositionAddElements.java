//8.	WAP to insert an element in a specific position into an array.
package array_practice;
import java.util.*;
public class PositionAddElements {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]= {10,20,30,0,50};
		
		System.out.println("Array Elements");
		for(int i:arr)
			System.out.println(i);
		
		System.out.println("Enter position-->");
		int pos=sc.nextInt();
		
		System.out.println("Enter Elements Which U want to Add-->");
		int ele=sc.nextInt();
		
		//add elements in array
		arr[pos-1]=ele;
		for(int i:arr)
			System.out.println(i);
		
		
	}

}