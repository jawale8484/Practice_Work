//passing array as method
package array_practice;

public class ArrayAsMethod {
	void p1(int arr[]) {
		System.out.println("Array elements are");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		ArrayAsMethod ob=new ArrayAsMethod();
		int arr[]= {10,20,30,40,50};
		ob.p1(arr);
	}

}
