//Practice for user define exception

package exception_handling;

import java.io.*;
import java.util.*;

class InvalidCountryException extends Exception {
	public InvalidCountryException(String s) {
		super(s);
	}
}

class InvalidAgeException extends Exception {
	public InvalidAgeException(String s) {
		super(s);
	}
}

public class UserRegistration {
	void registerprofile(String username, String country,int age) throws InvalidCountryException, InvalidAgeException {
		if (!(country.equalsIgnoreCase("india"))) {
			throw new InvalidCountryException("User Outside India Cannot be register");
		
		}else if (age < 18) {
			throw new InvalidAgeException("User is Minor");
		}else {
			System.out.println("Registration done....!");
		}

	}

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		UserRegistration ob = new UserRegistration();
		System.out.println("Enter User name->");
		String nm = sc.next();
		System.out.println("Enter age->");
		int age = sc.nextInt();
		System.out.println("Enter country->");
		String cn = sc.next();
		ob.registerprofile(nm,cn,age);
	}
}
