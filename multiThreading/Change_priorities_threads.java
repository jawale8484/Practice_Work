//Check priority of thread

package multiThreading;

public class Change_priorities_threads extends Thread {

	public void run() {
		System.out.println("Hello-word");
	}

	public static void main(String[] args) {
		Change_priorities_threads t1 = new Change_priorities_threads();
		System.out.println("Normal->"+t1.getPriority());
		t1.setPriority(MAX_PRIORITY);
		System.out.println(t1.getPriority());
		System.out.println(t1.MIN_PRIORITY);
		t1.start();
	}

}
