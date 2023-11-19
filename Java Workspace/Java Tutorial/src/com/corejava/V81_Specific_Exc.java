
    // video 81 handling specific exception java

import java.util.Scanner ;

public class V81_Specific_Exc {
   public static void main(String[]args) {
	    
	   int [] marks = new int[3];
	   marks[0]=1;
       marks [1]= 56;
       marks [2]=6;
        
       Scanner sc= new Scanner(System.in);
       System.out.println("enter the array index");
        int ind= sc.nextInt();
        
        System.out.println("enter the number you want to dwvide");
        int number = sc.nextInt();
        
        try {
        	System.out.println(" the value at array index enterd is "+marks[ind]);
        	System.out.println("the value of array-value/ number" + marks[ind]/number );
        }
        catch (ArithmeticException e) {
        	System.out.println(" some Arithmetic exception occured");
        	System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        	System.out.println(" ArrayIndex out of bound exception occured");
        	System.out.println(e);
        }
        	 catch (Exception e) {
             	System.out.println(" some exception occured");
             	System.out.println(e);
        	 }
//        	// op =enter the array index
//        	1
//        	enter the number you want to dwvide
//        	0
//        	 the value at array index enterd is 56
//        	 some exception occured
//        	java.lang.ArithmeticException: / by zero
//        	 op 2enter the array index
//        	1
//        	enter the number you want to dwvide
//        	2
//        	 the value at array index enterd is 56
//        	the value of array-value/ number28
        
        
//        op =enter the array index
//        88
//        enter the number you want to dwvide
//        2
//         ArrayIndex out of bound exception occured
//        java.lang.ArrayIndexOutOfBoundsException: Index 88 out of bounds for length 3
//
//        }
//        
//   } 
//        