
class MyThr extends Thread{
	
	 public MyThr(String name) {              // constructor 
		 super(name);	 
	 }
   public void run() {                         // method
	int i= 34;
	System.out.println("thank you");
   //while(true) {
	//	System.out.println(" I am Thread "); 
 // }	
}	 
}

public class V73_Constructor_javaClass {
   public static void main (String[]args) {
	   
	   MyThr t1= new MyThr("Harry");
	   t1.start();
	   System.out.println("the id of the thread is" + t1.getId());
	   System.out.println(" the name of id " + t1.getName());
   }
}
 /* op thank you
  the id of the thread is21
  the name of id Harry */
