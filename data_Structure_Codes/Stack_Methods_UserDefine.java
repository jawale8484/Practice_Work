//This is User define Stack implementation program

package data_Structure_Codes;

import java.util.Scanner;

public class Stack_Methods_UserDefine {
	static Scanner sc = new Scanner(System.in);


	static int stack[];
		
	static {
		Stack_Methods_UserDefine.create();
	}
	
	
	static int size;
	//Enter The Size Of Stack
	 static void create() {
		System.out.println("Enter size of stack");
		size=Stack_Methods_UserDefine.sc.nextInt();
		
		Stack_Methods_UserDefine.stack=new int[size];
		System.out.println("Stack created with the size- "+size);
	}
	
	//int max=50;
	//int stack[] = new int[max];
	
	int top = 0;

	//Insert elements in Stack
	public void push(int add) {
		if (top ==size ) {
			System.out.println("Stack is full...");
		} else {

			stack[top] = add;
			top++;

		}

	}

	
	//Display elements in Stack
	public void show() {
		for (int n : stack) {
			System.out.print(n + " ");
		}
	}
	
	//Delete elements from Stack
	public int pop() {
		int data = 0;

		if (isEmpty()) {
			System.out.println("Stack is Empty...!!");
		} else {
			top--;
			data = stack[top];
			stack[top] = 0;

		}
		return data;
	}
	
	//Return Current Elements in Stack
	public int peek() {
		int data;
		data = stack[top - 1];
		return data;
	}
	
	//Display Size of Elements in Stack
	public int size() {
		return top;
	}

	//Display Stack is Empty Or Full
	public boolean isEmpty() {
		return top <= 0;

	}

}
