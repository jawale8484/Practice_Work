//Find how many times a character are present in String
package string_practice;
import java.util.*;
public class FindSingleCharacterOccuernaceInString {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String-");
		String s=sc.nextLine();
		
		System.out.println("Enter a character to find occurence in string--> ");
		char c=sc.next().charAt(0);
		
		char ch[]=s.toCharArray();
		int count=0;
		for(int i=0;i<ch.length;i++) {
			if(ch[i]==c) {
				count++;
			}
		}
		System.out.println(c+" Are present in->"+count+" time");
		
		
	}
}
