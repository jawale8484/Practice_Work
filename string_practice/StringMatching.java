//Program for matching a string to given sentences

package string_practice;

public class StringMatching {
	public static void main(String args[]) { 
        
	      // Initializing String  
	      String Str = new String("Welcome to geeksforgeeks"); 
	        
	      // Testing if regex is present 
	      System.out.print("Does String contains regex (.*)geeks(.*) ? : " ); 
	      System.out.println(Str.matches("(.*)geeks(.*)")); 
	        
	      // Testing if regex is present 
	      System.out.print("Does String contains regex geeks ? : " ); 
	      System.out.println(Str.matches("geeks")); 
	        
	   } 
}
