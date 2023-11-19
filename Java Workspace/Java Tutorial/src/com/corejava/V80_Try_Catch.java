  
   // video 80 try catch block in java'     

public class V80_Try_Catch {
       public static void main(String[] args) {
       
       int a=60000;
       int b= 0;
       
       // 1. WITHOUT TRY
       int c= a/b ;
	   System.out.println("the result is " + c);
	   
//	   // OP =Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
//		Syntax error, insert "}" to complete ClassBody
//
//		at V80_Try_Catch.main(V80_Try_Catch.java:29)
       
//	   
//       // 2. WITH TRY METHOD
//       try {
//    	   int c= a/b ;
//    	   System.out.println("the result is " + c);
//       }
//       catch ( Exception e) {
//    	   System.out.println(" we failed to divide. REASON");
//      System.out.println(e);
//       }
//         System.out.println(" END OF PROGRAM");
//        
//         /* OP  we failed to divide. REASON
//java.lang.ArithmeticException: / by zero
// END OF PROGRAM */
//       }
       
}
