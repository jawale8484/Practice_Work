/*print pattern in 1-*
				   2-* *
				   3-* * * this form   */

package pattern;

public class NewTypeOfpattern {
	public static void main(String[] args) {
		int digit=1;
		for(int i=1;i<=5;i++) {
			System.out.print(digit);
			digit++;
			System.out.print("-->");
			for(int j=1;j<=i;j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
	}

}

/*  Output--->
  
5--> *  *  *  *  * 
4--> *  *  *  * 
3--> *  *  * 
2--> *  * 
1--> * 

*/
