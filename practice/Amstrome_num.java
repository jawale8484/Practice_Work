//Armstrong number
package practice;

import java.util.Scanner;

public class Amstrome_num {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		
		double ognum=num;
		double count=0; double sum=0;
		while(num!=0) {
			num=num/10;
			count++;
		}
		double temp=0;
		while(num!=0) {
			double rem=num%10;
			temp=Math.pow(rem,count);
			sum=sum+temp;
			num=num/10;	
			}		
		if(ognum==sum ) {
			System.out.println("Amstrome");
			
		}else {
			System.out.println("not am");
		}

		
	}


}
