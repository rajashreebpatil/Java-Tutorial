
class MyNewThr1 extends Thread{
	
	 public MyNewThr1(String name) {              // constructor 
		 super(name);	 
	 }
   public void run() {                         // method
	 while(true) {
	  System.out.println(" I am Thread - thanks "); 
	   
	 }
   }
}
  

class MyNewThr2 extends Thread{
	
	 
   public void run() {                         // method
	 while(true) {
	  System.out.println(" I am Thread - thanks2 "); 
	   
	 }
   }
}

public class V75_Thread_Method {
 public static void main(String[]args) {
	 
	 MyNewThr1 t1= new  MyNewThr1("harry1");
	   MyNewThr2 t2= new MyNewThr2();
	   
	    t1.start();
	    try {                              // thread try-catch method to run join method
	    	                               // join method is use to kill t1.start() method
	    t1.join();
	    }
	    catch(Exception e) {
	    	System.out.println(e);
	    	
	    }
	    t2.start();
	   
 }
}

/* op thanks 
I am Thread - thanks 
I am Thread - thanks 
I am Thread - thanks 
