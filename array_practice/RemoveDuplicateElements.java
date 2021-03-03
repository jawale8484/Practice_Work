//Remove Duplicate Elements in Array
package array_practice;

import java.util.Arrays;

public class RemoveDuplicateElements {
	public static void main(String args[]) {
		int arr[] = { 1, 3, 5, 6, 5, 4, 6, 8, 8, 9, 10 };
		System.out.println("Sorted Array-->");
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		int j = 0;
		// Remove Duplicate elements
		// first way
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				arr[j] = arr[i];
				j++;
			}
		}
		arr[j] = arr[arr.length - 1];

		// print result
		System.out.println("\nAfter Removing Duplicatre Elements Using First Way-->");
		for (int i = 0; i < j + 1; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("\n \n");

		// using second way by using temp[] array
		

	}
}
