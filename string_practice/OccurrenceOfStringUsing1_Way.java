//Find the occurrences of character in string

//But in this program we have a problem.
//This code only for a unique case-->means all String in Uppercase or Lowercase

package string_practice;

import java.util.*;

public class OccurrenceOfStringUsing1_Way {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter all letters are in same case-->");
		System.out.println("Enter String- ");
		String s = sc.nextLine();

		String st = new String(s);
		System.out.println(st);

		char ch[] = st.toCharArray(); // converting String into array u
		int temp[] = new int[ch.length]; // temporary array for counting the occurrences

		int visited = -1;
		for (int i = 0; i < ch.length; i++) {
			int count = 1;
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					temp[j] = visited;
					count++;
				}
			}
			if (temp[i] != visited) {
				temp[i] = count;
			}
		}

		// print result
		System.out.println("Show the all occurrences of character in string");
		for (int i = 0; i < temp.length; i++) {
			if (temp[i] != visited) {
				System.out.println(ch[i] + " ->" + temp[i]);
			}
		}
		System.out.println("Another output-->");
		//By using this way we can display the o/p in *
		//like number of occurrences are show in *

		for (int i = 0; i < temp.length; i++) {
			if (temp[i] != visited) {
				System.out.print(ch[i]);
				System.out.print("-->");
				}
				if (temp[i] != visited) {
					for (int j = 0; j < temp[i]; j++) {
						System.out.print("* ");

					}
					System.out.println();
				}
			}
		}

	}

