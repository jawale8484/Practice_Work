//Sum of elements
package array_practice;

public class SumOfElements {
	public static void main(String[]args) {
		int arr[]= {10,20,30,40,50};
		System.out.println("Array elements-->");
		for(int i:arr)
			System.out.println(i);
		//sum of digits
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		System.out.println("Sum of digits-->"+sum);
	}
}
