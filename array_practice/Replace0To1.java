//Replace all 0 to 1
package array_practice;

public class Replace0To1 {
	public static void main(String []args) {
		int arr[]= {5,60,0,40,0,33,44};
		System.out.println("Array-->");
		for(int i:arr)
			System.out.print(i+" ");
		System.out.println();
		
		
	//Replace 0 to 1
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==0) {
				arr[i]=1;
			}
		}
		System.out.println("After Replace-->");
		for(int i:arr)
			System.out.print(i+" ");
	}

}
