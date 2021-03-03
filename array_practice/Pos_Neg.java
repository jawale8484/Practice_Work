//9.	Write a Java program to arrange the elements of an given array of integers where all
 
//positive integers appear before all the negative integers.
package array_practice;

import java.util.Scanner;

public class Pos_Neg {

	public static void main(String[] args) {
		int arr[]= {10,90,-50,20,-60,40,-40,30,-30,};
		for(int i:arr)
			System.out.print(i+" ");
		
		int temp[]=new int[arr.length];
		int count=0;
		for(int i=0,j=0;i<arr.length;i++) {
			if(arr[i]>0) {
				temp[j]=arr[i];
				count++;
				j++;
			}
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<0) {
			temp[count]=arr[i];
			count++;
			}
		}
		
		//printing array
		System.out.println("\n After result");
		for(int i=0;i<temp.length;i++) {
			System.out.print(temp[i]+" ");
		}
		
	}

}
