//Check weather the string is pallindrome or not

package string_practice;
import java.util.*;
public class PalindronmOrNotString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String for check the is it palindrome->");
		String st=sc.next();
		String original=st;
		String reverse="";
		
		for(int i=st.length()-1;i>=0;i--) {
			reverse=reverse+st.charAt(i);
		}
		if(original.equals(reverse)) {
			System.out.println("String is palindrome-:)");
		}else {
			System.out.println("String is not palindrome--(:");
		}
	}
}
