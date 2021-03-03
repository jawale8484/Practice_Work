//Count the occurrences of word in given string
package string_practice;
import java.util.*;
public class OccurenceOfWord {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s="we all love java because java is easy to write and learn";
		System.out.println(s);
		System.out.println("Enter word for count occurrences in given String->");
		String word=sc.next();
		
		String st[]=s.split(" ");
		int count=0;
		for (int i = 0; i < st.length; i++) {
			if(st[i].equals(word)) {
				count++;
			}
		}
		System.out.println(word+" <-Are present-> "+count+" times in given string");
		
	}

}
