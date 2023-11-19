import java.util.Scanner;

// video 83 EXCEPTION CLASS IN JAVA
   
 class MyException extends Exception{
	  @Override
	  public String toString() {
		  return " I am toString()";
	  }
	  
	  @Override 
	   public String getMessage() {
		  return " I am getMessage()";
		 }
    }

public class V83_Exception_Class {
  public static void main(String[]args) {
  
  int a;
  Scanner sc= new Scanner(System.in);
  a= sc.nextInt();
  if(a<99) {
	  
	  try {
	  throw new  MyException();
  }
   catch (Exception e) {
	   System.out.println(e.getMessage());
	   System.out.println(e.toString());
	   System.out.println(e);
	 e.printStackTrace();
	 
	 // op 5
//	 I am getMessage()
//	 I am toString()
//	 I am toString()
//	 I am toString()
//		at V83_Exception_Class.main(V83_Exception_Class.java:26)
   }
}
}
}