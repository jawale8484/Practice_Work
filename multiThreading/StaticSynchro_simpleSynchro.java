//8.	If thread t1 is accessing static synchronized method m1,
//can thread t2 access synchronized method m2 at same time.

package multiThreading;
class sync{
	static synchronized void m1() {
		for(int i=1;i<=5;i++) {
			System.out.println("Java is secure");
		}
	}
	synchronized void m2() {
		for(int i=0;i<5;i++) {
			System.out.println("Java is pogramming langauge");
		}
	}
}

class thr1 extends Thread{
	public void run() {
		sync.m1();
	}
}
class thr2 extends Thread{
	sync ob;
	public thr2(sync ob) {
		this.ob=ob;
	}
	public void run() {
		ob.m2();
	}
}
public class StaticSynchro_simpleSynchro {

	public static void main(String[] args) {
		sync ob=new  sync();
		 thr1 t1=new thr1();
		 thr2 t2=new thr2(ob);
		 
		 t1.start();
		 t2.start();
	}

}
