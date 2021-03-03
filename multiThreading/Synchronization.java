//6.	Show example of synchronized method in which two threads are trying to update same thread.

package multiThreading;

class synchro{
	synchronized void table(int num){
		for(int i=1;i<=10;i++) {
			int result=num*i;
			System.out.println(result);
		}
		System.out.println("-----***-----");
	}
}
class th1 extends Thread{
	synchro ob;
	public th1(synchro ob) {
		this.ob=ob;
		// TODO Auto-generated constructor stub
	}
	public void run() {
		ob.table(5);
	}
}
class th2 extends Thread{
	synchro ob;
	public th2(synchro ob) {
		this.ob=ob;
	}
	public void run() {
		ob.table(2);
	}
}
public class Synchronization {

	public static void main(String[] args) {
		synchro ob=new synchro();
		th1 t1=new th1(ob);
		th2 t2=new th2(ob);
		t1.start();
		t2.start();
	}

}
