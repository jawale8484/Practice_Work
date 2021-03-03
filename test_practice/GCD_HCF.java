package test_practice;
import java.util.*;
public class GCD_HCF {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number-:");
		int num1=sc.nextInt();
		System.out.println("Enter second number-:");
		int num2=sc.nextInt();
		
		
		//logic 1
		
		int gcd=1;
		for(int i=1;i<=num1 && i<=num2;i++) {
			if(num1 % i==0 && num2 % i==0) {
				gcd=i;
			}
		}
		System.out.println("GCD of this two number are-:"+gcd);
	
		//logic second
		
		 while (num1 != num2) {
	        	if(num1 > num2)
	                num1 = num1 - num2;
	            else
	                num2 = num2 - num1;
	        }

	        System.out.printf("GCD of given numbers is: %d", num2);

	
	}
	

}
