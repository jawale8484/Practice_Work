//programs for practicing  Multithreading
package multiThreading;

class thre1 extends Thread {
	public void run() {
		for (int i = 0; i <= 3; i++) {
			System.out.println("Hello java");
		}
	}
}

class thre2 extends Thread {
	public void run() {
		System.out.println("i love java");
	}
}

public class Practice_1 {

	public static void main(String[] args) {
		thre1 t1 = new thre1();
		thre2 t2 = new thre2();
		t1.start();
		t2.start();
	}

}
