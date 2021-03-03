//Sort a String

package test_practice;
import java.util.*;
import java.io.*;
public class StringSorting {

	static void sort(String in) {
		//convert given string into char arrray
		char arr[]=in.toCharArray();
		
		int temp=0;
		for(char i=0;i<arr.length;i++) {
			for(char j=(char) (i+1);j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=(char) temp;
				}
			}
		}
		System.out.println("After sorting-->");
		for(char i:arr) {
			System.out.print(i);
		}
		
	}
	
	
	public static void main(String[] args) {
		String in="ajdkaslddjs";
		sort(in);

	}

}
