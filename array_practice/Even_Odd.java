//19.	Write a Java program to separate even and odd numbers of an given array of integers. 
//Put all even numbers first, and then odd numbers.
package array_practice;

public class Even_Odd {
	public static void main(String[] vaibhav) {
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		System.out.println("Array-->");
		for(int i:arr)
			System.out.print(i+" ");
		System.out.println();
		
		//Separate even and odd elements
		//create temporary array
		int temp[]=new int[arr.length];
		int count=0;
		for (int i = 0,j=0; i < arr.length; i++) {
			if(arr[i]%2==0) {
				temp[j]=arr[i];
				count++;
				j++;
			}
		}for (int i = 0,j=0; i < arr.length; i++) {
			if(arr[i]%2!=0) {
				temp[count]=arr[i];
				count++;
				
			}
		}
		
		System.out.println("Result-->");
		for(int i:temp)
			System.out.print(i+" ");
		
	}
}
