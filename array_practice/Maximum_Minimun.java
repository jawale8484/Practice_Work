//find Maximum and Minimum Elements is array

package array_practice;
import java.util.*;
public class Maximum_Minimun {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		int arr[]= {10,20,30,40,55,65,30};
		System.out.println("Array elemets-->");
		 for(int i:arr)
			System.out.print(i+" ");
		
		//sorting array
		int temp=0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]<arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
		}
		System.out.println("Sorted array-->");
		for(int i:arr)
			System.out.print(i+" ");
		
		//maximum elements in array
		int max=arr[0];
		for (int  i= 0; i < arr.length; i ++) {
			if(arr[i]>max) {
				max=arr[i];
			}			
		}
		System.out.println("\n Maximun Element-->"+max);
		
		int min=arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]<min)
				min=arr[i];
		}
		System.out.println("Minimum Element are->"+min);
		
		
		
		//N-th position
		System.out.println("\n Enter the n positon of maximum number");
		System.out.println("Enter N-th maximum number for elements-->");
		int n=sc.nextInt();
		int maxi=arr[0];int tempp=0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]<arr[j]) {
					tempp=arr[i];
					arr[i]=arr[j];
					arr[j]=tempp;
				}
				
			}
			if(i==n-1) {
				System.out.println(n+"->maximum number are-->"+arr[i]);
				break;
			}
			
		}
		
		
	}
	
	

}
