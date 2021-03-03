//Count the frequency of array elements
package array_practice;

public class FrequncyCountArray {
	public static void main(String []args) {
		int arr[]= {-10,20,-10,30,50,40,50,40,60};
		for(int i:arr)		// for each array elements
			System.out.print(i+" ");
		//count frequency of an array elements
		int temp[]=new int[arr.length];
		int visited=-1;
		System.out.println("\n count frequency of an array elements-->");
		for(int i=0;i<arr.length;i++) {
			int count=1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					temp[j]=visited;
					count++;   
				}
			}
			if(temp[i]!=visited) {
				temp[i]=count;
			}
			
		}
		System.out.println();
		for(int i=0;i<temp.length;i++) {
			if(temp[i]!=visited)
			System.out.println(arr[i]+" ->"+temp[i]);
		}
	}
}
