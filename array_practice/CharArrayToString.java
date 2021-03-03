package array_practice;

public class CharArrayToString {
	public static void main(String ags[]) {
		char ch[]= {'v','a','i','b','h','a','v'};
		System.out.println("Elements in character array-->");		
		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);
		}
		System.out.println("Convert char array to String");
		String s=new String(ch);
		System.out.println(s);
	}
}
