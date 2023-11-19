
public class V35_Ch7_Practice {
	
	// 1. PROBLEM = MULTIPLIATION OF NUMBER
	
//	static void multiplication(int n) {
//		
//		for(int i=0; i<=10;i++) {
//			System.out.println("4 "+ "x" + i +"=" + n*i);
//		}
//	}
//	public static void main(String[] args) {
//		multiplication(4);
//		
//		OUTPUT=
//		4 x0=0
//		4 x1=4
//		4 x2=8
//		4 x3=12
//		4 x4=16
//		4 x5=20
//		4 x6=24
//		4 x7=28
//		4 x8=32
//		4 x9=36
//		4 x10=40
	
	

 //      PROBLEM 2= PRINT * PATTERN
    		   
//    	static void pattern(int n) {
//    	   
//    	 for(int i=0 ; i<n; i++) {
//    		 for(int j=0; j<i+1; j++) {
//    			 System.out.print("*");
//    		 }
//                 System.out.println();
//    		 }
//		}
//       public static void main(String[] args) {
//		pattern(4);
//	}
//       OUTPUT =
//    		   *
//    		   **
//    		   ***
//    		   ****

	
     // PROBLEM 3  = SUM BY RECURSION
	
	// sum(n)=1+2+3+...+n
	//sum(n)= 1+2+3+n-1+n

//	static int sumRec(int n) {
//		int z;
//		if(n==1) {
//			return 1;
//		}
//		else {
//			z= n +sumRec(n-1);      // by recursion
//			return z;
//		}
//	}
//		public static void main(String[] args) {
//			System.out.println(sumRec(3));
//			
//		}
//	 OUTPUT =6
	
	    //5. problem - print n term of fibonacci series
	
	// FIBONACCI SERIES= 0,1,1,2,3,5,8,13,21,34
	
//	static int fib(int n) {
//		if(n==1) {
//			return 0;
//			}
//		else if(n==2) {
//			return 1;
//		}
//		else {
//			return fib(n-1)+fib(n-2);    //  BY RECURSION
//		}
//		}
//	public static void main(String[] args) {
//		int result=fib(5);
//		System.out.println(result);
//	}
//	OUTPUT =3
//			
	
	
	// PROBLRM * NY RECURSION
			
			static void pattern1_rec(int n) {
				if(n>0) {
					    pattern1_rec(n-1);
				
			 for(int i=0 ; i<n; i++) {
			     System.out.print("*");
				 }
		          System.out.println();
				 }
			}
		public static void main(String[] args) {
			pattern1_rec(4);
			
		}
		
		output 
		  *
		**
		***
		****
		
		
// note  patter1(3)
pattern1(2)+ 3 time star and new line 
pateern(1)  + 2 time star and new line +  3 time star and new line 
patter(0)+1 time star and new line + 2 time star and new line +  3 time star and new line 
	
	
	
	
	
	
}
