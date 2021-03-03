package array_practice;

public class FindMissingElements {
	public static void main(String[] args) {
		int arr[]= {11,12,14,15,16};
		System.out.println("Array Elemets are-->");
		for(int i:arr)
			System.out.print(i+" ");
		
//	int n=arr[arr.length-1];	
//	int total=(n/2)*((2*arr[0])+(n-1));		
	
	
		//this is also use to find sum of elements
//		int n=arr.length;
//		int total=(n+1)*(n+2)/2;
		
		
		//Another logic
//	
//	int sum=0;
//		System.out.println();
//		for (int i = 0; i < arr.length; i++) {
//			sum=sum+arr[i];
//		}
//		System.out.println("Missing->"+(total-sum));
		
		
		
		
		//this way is used for all types elements to find the misssing on
		//but the difference is common
		
		int total=(arr.length+1)*(arr[0]+arr[arr.length-1])/2;
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			sum=sum+arr[i];
		}
		
		int missing=total-sum;
		System.out.println("\nMissing elemet are-->"+missing);
		
	}

}
