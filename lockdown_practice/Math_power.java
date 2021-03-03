//power of base and exponential
package lockdown_practice;

import java.util.*;
import java.math.*;

public class Math_power {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter base");
		double base = sc.nextInt();
		System.out.println("Enter Exponetial");
		double expo = sc.nextInt();

//		double sum = Math.pow(base, expo);
//		System.out.println(sum);
//		
		double result=1;
		
//		Without using math.pow function--->
		while(expo!=0) {
			result=result*base;
			expo--;
		}
		System.out.println(result);
		
		
	}

}
