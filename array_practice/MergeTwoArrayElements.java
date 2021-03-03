//Merge two array in third array
package array_practice;

public class MergeTwoArrayElements {
	public static void main(String[] args) {
		int arr1[]= {10,20,30,40,50};
		int arr2[]= {60,70,80,90,100};
		System.out.println("First Array Elements-->");
		for(int i:arr1) 
			System.out.print(i+" ");
		System.out.println();
		
		System.out.println();
		System.out.println("Second Array Elements-->");
		for(int i:arr2) 
			System.out.print(i+" ");
		System.out.println();
		
		//Merge two array in third array
		int sum=arr1.length+arr2.length;
		int arr3[]=new int[sum];
		int count=0;
		for(int i=0;i<arr1.length;i++) {
			arr3[i]=arr1[i];
			count++;
			
		}
		
		
		for(int i=0;i<arr2.length;i++) {
			arr3[count]=arr2[i];
			count++;
		}
		
		//print third array
		System.out.println("\n Merge array--> ");
		for(int i=0;i<arr3.length;i++) {
			System.out.print(arr3[i]+" ");
		}
	}

}
