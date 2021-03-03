package exception_handling;
import java.util.*;
import java.lang.Exception;
public class Finallyblock {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Enter the value for divident");
			int divident =sc.nextInt();
			int a=10/divident;
			System.out.println(a);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		
		}
		finally {
			System.exit(0);
			System.out.println("code is end..!");
		}
	}
}
