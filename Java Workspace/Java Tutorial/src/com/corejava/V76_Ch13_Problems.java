//q1 = write a program to print good morning and welcome continuosldy using tgread
// q2 = add a sleep method in welcome thred to delAY ITS EXECUTION FOR 200 MS
// Q3 = DEMONSTARTE getPriority() setPriority() method in java thread
// q4 = how to get state of given thread in java
//q5= howbto get reference of current thread in java


    class PractiseSet13 extends Thread{
	   public void run() {
		
		   //   while (true) {
		//	   System.out.println("Good Morning");
		  // }
	   }
  } 
    
   class PractiseSet13b extends Thread{
	   public void run() {
		 
		   /*while (true) {
			   try {
				   Thread.sleep(200);
			   }
			   catch(Exception e) {
				   System.out.println(e);
			   }*/ 
		   
			   System.out.println("Welcome");
		 
	   }
   }

public class V76_Ch13_Problems {
	public static void main(String[]args) {
		
		PractiseSet13 p1 = new PractiseSet13();
		PractiseSet13b p2 = new PractiseSet13b();
		
		
		p1.setPriority(6);
      	p2.setPriority(9);
	
		System.out.println(p1.getPriority());
		System.out.println(p2.getPriority());
		System.out.println(p2.getState());
		System.out.println(Thread.currentThread().getState());
		
		p1.start();
		p2.start();	
	}
}
		  /*op  Good Morning
		6
		9
		NEW
		RUNNABLE
		Welcome */