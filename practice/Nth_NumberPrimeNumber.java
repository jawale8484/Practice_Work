import java.util.*;
public class Nth_NumberPrimeNumber
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Print First N Prime number \n Enter N Number");
		int num=sc.nextInt();
		
		int count=0,i=1,j=1,n=1;
		
		while(n<=num){
		    j=1;  
            count=0;  
                while(j<=i)  
                {  
                    if(i%j==0)  
                    count++;  
                    j++;   
                }  
            if(count==2)  
            {  
                System.out.printf("%d ",i);  
                n++;  
            }     
                i++;  
        }  
		}
		
	
}
