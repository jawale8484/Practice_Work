//Show the all occurrences of character in string

package string_practice;

import java.util.*;

public class occurrenceOfStringIn3_way {
	public static void main(String vaib[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String-->");
		String s = sc.nextLine();

		int arr[] = new int[26];
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 65 && s.charAt(i) <= 90) {
				arr[s.charAt(i) - 65]++;
			} else if (s.charAt(i) >= 97 && s.charAt(i) <= 122) {
				arr[s.charAt(i) - 97]++;
			}
		}

		System.out.println("Show the all occurrences of character in string");
		for (int i = 0; i < 26; i++) {
			if (arr[i] > 0) {
				System.out.println((char) (i + 65) + "--> " + arr[i]);
			}

		}
	}
}
