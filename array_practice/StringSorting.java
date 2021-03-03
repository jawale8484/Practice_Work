//Sorting string

package array_practice;
import java.util.*;
public class StringSorting {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String[] sn=new String[5];
		System.out.println("Enter Names-->");
		for (int i = 0; i < sn.length; i++) {
			sn[i]=sc.next();
		}
		System.out.println("Unsorted names -->");
		for (int i = 0; i < sn.length; i++) {
			System.out.print(sn[i]+" ");
		}
		//Arrays.sort(sn);
		//for (int i = 0; i < sn.length; i++) {
			//System.out.println(sn[i]);
		//}
		String temp=null;
		for (int i = 0; i < sn.length; i++) {
			for (int j = i+1; j < sn.length; j++) {
				if(sn[i].compareTo(sn[j])>0) {
					temp=sn[i];
					sn[i]=sn[j];
					sn[j]=temp;
				}
			}
		}
		
		System.out.println("\nsorted names -->");
		for(String name:sn) {
			System.out.print(name+" ");
		}
		
		
		
	}
}
