package pattern;
import java.util.*;
public class Pattern_121
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		for(int i=0;i<=5;i++){
		    for(int j=5-i;j>0;j--){
		        System.out.print(" ");
		    }for(int j=1;j<=i;j++){
		     System.out.print(j);
		    }
		    for(int j=i+1;j>0;j--){
		        System.out.print(j);
		    }
		    System.out.println();
		}
	}
}

/*Output-->
 * Hello World
     1
    121
   12321
  1234321
 123454321
12345654321
 */
 