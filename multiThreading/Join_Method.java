//join method

package multiThreading;

class thread1 extends Thread{
	public void run() {
		try {
			Thread.currentThread().sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.print(e+" ");
		}
		for(int i=1;i<=10;i++) {
			System.out.print(i+" ");
		}
	}
}
class thread2 extends Thread{
	public void run() {
		char ch='a';
		
		for(int i=0;i<=10;i++) {
			System.out.print(ch+" ");
			ch++;
		}
		System.out.println();
	}
}
public class Join_Method{

	public static void main(String[] args) {
		thread1 t1=new  thread1();
		thread2 t2=new thread2();
		t1.start();		
		t2.start();
		try {
			t2.join(500);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

}
