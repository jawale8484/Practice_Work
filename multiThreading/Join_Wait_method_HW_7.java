//7.	WAP to execute2 threads main and child thread, displaying that main
//thread calls join() and wait() 
//for the child thread to get executed first and then gets completed.

package multiThreading;

class childe extends Thread {
	public void run() {
		Thread.currentThread().setName("Childe-Thread");
		System.out.println(Thread.currentThread().getName());

	}
}

class main extends Thread {
	public void run() {
		Thread.currentThread().setName("Main-Thread");
		System.out.println(Thread.currentThread().getName());
		notify();

	}
}

public class Join_Wait_method_HW_7 {

	public static void main(String ags[]) throws InterruptedException {
		childe t1=new childe();
		main t2=new main();
		synchronized(t2) {
			try {
				t2.wait(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		t1.start();
		t2.start();
		t2.join();

	}

}
