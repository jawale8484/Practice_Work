
//arrange  positive elements before negative elements 
package array_practice;

public class PosNegElements {
	public static void main(String[] args) {
		int arr1[] = { 10, -5, 2, -9, 42, 15, -20, -45 };
		int arr2[] = new int[arr1.length];

		int count = 0;
		for (int i = 0, j = 0; i < arr1.length; i++) {
			if (arr1[i] > 0) {
				arr2[j] = arr1[i];
				count++;
				j++;

			}
		}

		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] < 0) {
				arr2[count] = arr1[i];
			count++;
			}
		}

		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
	}
}
