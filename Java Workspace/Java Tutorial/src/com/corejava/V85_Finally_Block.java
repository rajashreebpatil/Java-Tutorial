
public class V85_Finally_Block {
public static int greet() {
	
	 try {
		 int a=50;
		 int b=2;
		 int c= a/b;
		 return c;
	 }
	 catch(Exception e) {
		 System.out.println(e);
	 }
	 finally {
		 System.out.println("this is end of program");
		 
	 }
	 return 0;
}
public static void main(String[]args) {
	int k=greet();
	System.out.println(k);
	 
	// op = this is end of program
	 ///   25
	int a=9;
	int b=3;
	  while(true) {
		  try {
			  System.out.println(a/b);
		  }
		  catch(Exception e) {
			  System.out.println(e);	 
			  break;
		  }
	      finally {
	    	  System.out.println(" the value ofb is " +b);
	      }
	   b--;
	
	// op this is end of program
//	   25
//	   3
//	    the value ofb is 3
//	   4
//	    the value ofb is 2
//	   9
//	    the value ofb is 1
//	   java.lang.ArithmeticException: / by zero
//	    the value ofb is 0
//	
	  }	
}
}
