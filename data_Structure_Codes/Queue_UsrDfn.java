//This is User define Queue implementation Program

package data_Structure_Codes;

import java.util.Scanner;

public class Queue_UsrDfn {
	static Scanner sc=new Scanner(System.in);
	static int ss;
//	int queue[] = new int[5];
	int front, rear, size;

	static int queue[];
	
	static {
		Queue_UsrDfn.create();
	}
	
	public static void create() {
		System.out.println("Enter the size of Queue");
		ss=Queue_UsrDfn.sc.nextInt();
		Queue_UsrDfn.queue=new int[ss];
	}
	
	

	// Insert Elements in Queue
	public void enQueue(int data) {
		if (!isFull()) {
			queue[rear] = data;
			rear = (rear + 1) % ss;
			size++;
		} else {
			System.out.println("Queue is Full...");
		}
	}

	// Delete Elements In Queue
	public int deQueue() {
		int data = queue[front];
		if (!isEmpty(this)) {
			front = (front + 1) % ss;
			size--;
		} else {
			System.out.println("Queue is Empty..");
		}
		return data;
	}

	// Show Size of Elements in Queue
	public int getSize() {
		return size;
	}

	// Check Queue is Empty Or Not
	public boolean isEmpty(Queue_UsrDfn q) {
		return getSize() == 0;
	}

	// Check Queue is Full Or Not
	public boolean isFull() {
		return getSize() == ss;
	}
	
	
	
	//show rear Element in Queue
	public int rear() {
		if(isEmpty(this)) {
			System.out.println("Queue is Empty");
		}
		return this.queue[rear];
	}
	
	//shoe front Element is Queue
	public int front() {
		if(isEmpty(this))
		{
			System.out.println("Queue is Empty");
		}
		return this.queue[front];
	}
	

	// Display All Elements in Queue
	public void show() {
		// System.out.println("\nAll Elements--");
		// for(int i:queue)
		// System.out.print(i+" ");

		System.out.println("\nElements in Queue Are->");
		for (int i = 0; i < size; i++) {
			System.out.print(queue[(front + i) % ss] + " ");
		}
		System.out.println();
	}

}
