
class MyThread1 implements Runnable{
	
	public void run() {
		System.out.println("I am thread1");
	}
	}

class MyThread2 implements Runnable{
	public void run() {
		System.out.println("I am thread2");
	}
}

public class V71_Thread_Runnable_Interface {
  public static void main(String[]args) {
	  
	  MyThread1 bullet1= new MyThread1();
	  Thread gun1= new Thread(bullet1);
	   
	  MyThread2 bullet2 = new MyThread2();
	  Thread gun2 = new Thread(bullet2);
	  
	  gun1.start();
	  gun2.start();
  }
}
// op I am thread2
//  I am thread1
