package pattern;

public class Pyramid_pattern_1 {
	public static void main(String[] args) {
		int n = 7;
		for (int i = 0; i < n; i++) {

			for (int j = n - i; j >= 0; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {

				// System.out.println("*"); //for left side pattern
				System.out.print("* "); // for pyramid pattern use "*_"
			}
			System.out.println();
		}}
}
		


