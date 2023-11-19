
public class V31_Ch7_method {
	
	
//	public static void main(String[]args) {
		
 //   CHAPTER 7 = METHODS IN JAVA
//               	1. NORMAL SUM
	
//	        int a= 5;
//            int b=7 ;
//            int c;
//            
//          if(a>b) {
//        	  c=a+b;
//          }
//          else {
//        	  c=(a+b)*5;
//        	   }
//		
//       int a1=2;
//       int b1=1;
//       int c1;
//       
//       if(a1>b1) {
//    	   c1= (a1+b1);
//    	   }
//       else {
//    	   c1= (a1+b1)*5;
//    	    }
//				  
//       System.out.println(c);
//				System.out.println(c1);
//				
//		output =60
//				3
//		
		
//                	2. BY USING METHODS =	1. BY STATIC METHOD
	
//				static int logic(int x, int y) {
//				int z;
//			
//				if(x>y) {
//		        	  z=x+y;
//		          }
//		          else {
//		        	  z=(x+y)*5;
//		        	   }
//				return z;
//					}
//					
//			public static void main(String[]args) {                   // MAIN MEHOD
//				
//			       int a= 5;
//		            int b=7 ;
//		            int c;
//		           c= logic(a,b);                                // LOGIC (X,Y)
//		      
//		       int a1= 2;
//	          int b1=1 ;
//	         int c1;
//		      c1=logic(a1,b1);
//		         
//		         System.out.println(c);
//		         System.out.println(c1);
	         
//	         output =60
//	        		 3
			
	
	//                2. BY CREATING OBJECT OF CLASS
				
//			 int logic(int x, int y) {                   // not static 
//				int z;
//			
//				if(x>y) {
//		        	  z=x+y;
//		          }
//		          else {
//		        	  z=(x+y)*5;
//		        	   }
//				return z;
//					}
//					
//			public static void main(String[]args) {   // MAIN MEHOD
//				
//			       int a= 5;
//		            int b=7 ;
//		            int c;
//		   // 2. METHOD INVOCATION USING OBJCT CREATION
//		            
//		    V31_Ch7_method obj=new V31_Ch7_method();
//		    c=obj.logic(a, b);
//		             
//		       int a1= 2;
//		      int b1=1 ;
//		     int c1;
//		      c1=obj.logic(a1, b1) ;  
//		    		  
//		         System.out.println(c);
//		         System.out.println(c1);
		         
					output = 60
							3
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
	}

}
