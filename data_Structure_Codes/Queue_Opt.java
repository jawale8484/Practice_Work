//In this Program we can Access all Methods 
//which is  by UserDefine implementation class Queue   Class(Queue_UsrDfn)

package data_Structure_Codes;

import java.util.*;

public class Queue_Opt {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue_UsrDfn q = new Queue_UsrDfn();

		int choice;

		do {
			System.out.println("1 :enDeque");
			System.out.println("2 :deQueue");
			System.out.println("3 :show");
			System.out.println("4 :rear");
			System.out.println("5 :front");
			System.out.println("6 :isEmpty");
			System.out.println("7 :isFull");
			System.out.println("8 : Exit");
			System.out.println("Enter Your Choice");
			choice = sc.nextInt();

			switch (choice) {

			case 1:
				System.out.println("Enter Elements in Queue");
				int data = sc.nextInt();
				q.enQueue(data);
				break;

			case 2:
				System.out.println("Element Deleted in Queue");
				q.deQueue();
				break;

			case 3:
				System.out.println("Elements in Queue");
				q.show();
				break;

			case 4:
				System.out.println(q.rear());
				break;

			case 5:
				System.out.println(q.front());
				break;

			case 6:
				System.out.println("Queue is Empty-->"+q.isEmpty(q));
				break;

			case 7:
				System.out.println("Queue is Full-->"+q.isFull());
				break;

			case 8:
				System.out.println("Thank You..");
				break;

			default:
				System.out.println("Invallide Input");
				break;

			}

		} while (choice != 8);

	}
}
