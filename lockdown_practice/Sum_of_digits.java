//sum of digits
package lockdown_practice;
import java.util.*;
public class Sum_of_digits {
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		System.out.println("Enter  Number");
		int num=sc.nextInt();
		int rem=0;
		int sum=0;
		
		while(num!=0){
		    rem=num%10;
		    sum=sum+rem;
		    num=num/10;
		    
		}
		System.out.println(sum);
	}
}
