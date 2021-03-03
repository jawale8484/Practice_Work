//Linear search
package array_practice;
import java.util.*;
public class Linear_search {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array-->");
		int size=sc.nextInt();
		//declaration of array
		int arr[]=new int[size];
		System.out.println("Enter Elements in array-->");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Elements in array are-->");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		//Linear search in array
		System.out.println("\n Enter search element which U want to search-->");
		int search=sc.nextInt();
		int i;
		for( i=0;i<arr.length;i++) {
			if(arr[i]==search) {
				System.out.println("Element "+search+" are in "+i+" indext position");
				break;
			}
		}
		if(i!=search) {
			System.out.println(search+" Elements are not found in an array");
		}
	}
}
