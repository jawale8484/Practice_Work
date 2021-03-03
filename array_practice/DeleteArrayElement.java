//Remove elements in arrays-->
package array_practice;

import java.util.*;

public class DeleteArrayElement {
	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 50, 60 };
		System.out.println("Array Elememts-->");
		for (int i : arr)
			System.out.print(i + " ");

		Scanner sc = new Scanner(System.in);
		System.out.println("\n Enter Elements which U Want to delete-->");
		System.out.println("Please enter matching element-->");
		int delete = sc.nextInt();

		// Delete Element in first way-->
		for (int i = 0; i < arr.length; i++) {
			if (delete == arr[i]) {
				for (int j = i; j < arr.length - 1; j++) {
					arr[j] = arr[j + 1];
				}
				break;
			}
		}
		System.out.println("\nUsing First way-");
		System.out.println("After deleting Elements in arrays are-->");
		for (int i = 0; i < arr.length - 1; i++) {
			System.out.print(arr[i] + " ");
		}

		// Using Second way By using temp[] array
		int temp[] = new int[arr.length];

		for (int i = 0, j = 0; i < arr.length - 1; i++) {
			if (delete != arr[i]) {
				temp[j] = arr[i];
				j++;
			}

		}
		System.out.println("\nusing second way");
		System.out.println("Result using temp array-->");
		for (int i = 0; i < temp.length-1; i++) {
			System.out.print(temp[i]+" ");
		}
	}

}
