//In this program we can access the all Stack methods
//which is created by User define Stack implementation.  Class(Stack_Method_Userdeine)

package data_Structure_Codes;

import java.util.Stack;
import java.util.*;


public class Stack_Operations extends Stack_Methods_UserDefine{

	
	
	
	
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);

		Stack_Methods_UserDefine nums=new Stack_Methods_UserDefine();   //user define class for stack
		
		int choice;
		do {
			
			//System.out.println("\n1: Declare Size of Stack");
			System.out.println("\n1: Push");
			System.out.println("2: Peek");
			System.out.println("3: pop");
			System.out.println("4: check size of elements");
			System.out.println("5: isEmpty");
			System.out.println("6: Show");
			System.out.println("7: Exit");
		
			System.out.println("Enter your choice");
			choice=sc.nextInt();
			switch(choice) {
			
			case 1:
				System.out.println("Enter Elements");
				int add=sc.nextInt();
				nums.push(add);
				break;
				
			case 2:
				System.out.println("Current Element Which Enter in Stack");
				System.out.println(nums.peek());
				break;
				
			case 3:
				nums.pop();
				break;
				
			case 4:
				System.out.println("Size of Elemets in Stack");
				System.out.println(nums.size());
				break;
				
			case 5:
				System.out.println("Is Stack isEmpty-" +nums.isEmpty());
				break;
				
			case 6:
				nums.show();
				break;
			case 7:
				System.out.println("Thank You..");
				break;
				
			default :
				System.out.println("Invallide Input");
			}
			
		}while(choice!=7);
		
		
	}
}
