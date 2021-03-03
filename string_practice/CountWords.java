//java program to count the number of word in given string
package string_practice;

import java.util.*;

public class CountWords {
	public static void main(String vaibhav[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Sentence->");
		String s=sc.nextLine();
		
		//first way
		char ch[]=s.toCharArray();
		int count=0;
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]==32) {          //here 32 is ASCII  value of space 
				count++;
			}
		}
		System.out.println("Using first way-");
		System.out.println("Number of Words are presens in Sentence are-->"+(count+1));
		
		
		//second way
		int scount=0;
		String st[]=s.split(" ");
		for (int i = 0; i < st.length; i++) {
			scount++;
		}
		System.out.println("Using second way-");
		System.out.println("Number of Words are presens in Sentence are-->"+(scount));
		

		
	}
}
