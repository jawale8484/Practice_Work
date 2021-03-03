//Java program toggle all character
package string_practice;
import java.util.*;
public class String_Toggle {
	public static void main(String[] Vaibhav) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String-->");
		String s=sc.nextLine();
		
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>=65&&ch[i]<=90) {
				ch[i]=(char) (ch[i]+32);
			}else if(ch[i]>=97&&ch[i]<=122) {
				ch[i]=(char)(ch[i]-32);
			}
			System.out.print(ch[i]);
		}
		
		
	
		
		
		
		
	}
}
