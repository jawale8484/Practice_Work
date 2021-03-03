package array_practice;

public class RemoveDuplicateUsingTempArray {
	public static void main(String[] args) {
		int arr[]= {1,2,3,3,4,5,6,6,7,8,9,9,10,12,12,13};
		System.out.println("Array-->");
		for(int i:arr)
			System.out.print(i+" ");
		
		//removing duplicate using temp array
		int temp[]=new int[arr.length-1];
		int count=0;
		for (int i = 0; i < arr.length-1; i++) {
			if(arr[i]==arr[i+1]) {
				count++;
			}
		}
		System.out.println("\nNumber of Duplicate Elements are->"+count);
		int j=0;
		for (int i = 0; i < arr.length-1; i++) {
			if(arr[i]!=arr[i+1]) {
				temp[j]=arr[i];
				j++;
			}
		}
		int vp=temp.length-count;
		for (int i = 0; i < vp; i++) {
			System.out.print(temp[i]+" ");
		}
		
	}
}
