//Binary serach
package array_practice;
import java.util.*;
public class Binary_search {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array-->");
		int size=sc.nextInt();
		//declare array
		int arr[]=new int[size];
		System.out.println("Enter array "+size+" Elements in array-->");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Elements in array are-->");
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+" ");
		}
		
		//Sorting an array-->
		for(int i=0;i<arr.length;i++) {
			int temp=0;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("\n Sorted Elements in array are-->");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
	//Binary search-->
		int li=0;
		int hi=arr.length-1;
		int mid=(li+hi)/2;
		System.out.println("\n Enter Elements which U Want To Search in Array->");	
		int search=sc.nextInt();
		
		while(li<=hi) {
			if(arr[mid]==search) {
				System.out.println("Elements "+search+" are in "+mid+" Index position in array->");
				break;
			}else if(arr[mid]<search) {
				li=mid+1;
			}else {
				hi=mid-1;
			}
			mid=(li+hi)/2;
		}
		if(li>hi) {
			System.out.println("Sorry..! Elements are not found in array.");
		}
		
		
		
	}
}
