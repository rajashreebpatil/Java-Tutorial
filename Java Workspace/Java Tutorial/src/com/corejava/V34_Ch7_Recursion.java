
public class V34_Ch7_Recursion {
	
	// FACTORIAL(0)=1;
	// FACTORAIL (N)= 5 X4X3X2X1;
	
	//1.  BY RECURSION
//	
//      static int add(int n) {
//	   
//	     if(n==0 || n==1) {
//	    	 return 1;
//	     }
//	     else {
//	    	 return n*add(n-1);       //   RECUERSION by calling itself 
//	     }
//	   }
//	
//	public static void main(String[] args) {
//		int x=4;
//		System.out.println("the value is:" + factorial (x));
		
//	}
//	output =V34_Ch7_Recursion.java
		   
			
//			2. BY ITERative approach
			
			
		      static int factorial_iterative(int n) {
			   
			     if(n==0 || n==1) {
			    	 return 1;
			     }
			     else {
			    	 int product=1;
			    			 for(int i=1; i<=n;i++) {
			    				 product *=i ;        //   RECUERSION by calling itself 
			    			 }
			    	 return product;
			     }
			   }
			
			public static void main(String[] args) {
				int x=4;
				System.out.println("the value is:" + factorial_iterative(x));
		
	   }
			output-the value is:24
	   
	   
}
	   
  


