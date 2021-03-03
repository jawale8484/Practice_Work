//program to show charcter for given ascii value or vice-versa.

package test_practice;

import java.io.*;
import java.util.*;

public class CharIntoAscii_AsciiIntoChar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Character->");
		char ch=sc.next().charAt(0);
		
		//show the ascii value of character
		int value=(char)ch;				//type cast
		System.out.println("ASCII value of "+ch+" is->");
		System.out.println(value);
		
		//show the the character of ascii value
		System.out.println("Enter ASCII value->");
		int asvalue=sc.nextInt();
		
		char cs=(char)asvalue;
		System.out.println(cs);
		
		
	}
}