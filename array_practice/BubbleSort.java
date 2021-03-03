//Bubble sort
package array_practice;

public class BubbleSort {
	public static void main(String[] args) {
		int arr[]= {50,60,40,30,20,70};
		System.out.println("Array Elements-->");
		for(int i:arr)
			System.out.println(i);
		
		//Bubble sort
		int temp=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
				}
			}
		}
		System.out.println("Using Bubble Sort-Sorting Elements-->");
		for(int i:arr)
			System.out.print(i+" ");
		
	}
}
