
public class V24_Ch5_loop {
	public static void main(String[]args) {

	//	1. for loop break means break and exit loop
		
//		for(int i=0;i<5;i++ ) {
//			System.out.println(i);
//			System.out.println("java is great");
//	
//		if(i==2) {
//			System.out.println("end loop");
//			break;
//		}
//		}
		
//		output =
//				0
//		java is great
//		1
//		java is great
//		2
//		java is great
//		end loop
		
		
//	 2. while loop
		
//		int i = 0;
//	     while(i<5) {
//	    	 System.out.println(i);
//	    	 System.out.println("java is great");
//	    	 
//	   	 if(i==2) {
//	    	 System.out.println("end loop");
//	      break;
//	   	 }
//	     i++;
//        }
//	     output=0
//	    		 java is great
//	    		 1
//	    		 java is great
//	    		 2
//	    		 java is great
//	    		 end loop

		
//		3. do loop
	
//		int i =0;
//		do {
//			System.out.println(i);
//			System.out.println("java is great");
//			
//		if(i==2) {
//			System.out.println("end loop");
//			break;
//		}
//		i++;
//		  }while(i<5);
		
//		output_0
//		java is great
//		1
//		java is great
//		2
//		java is great
//		end loop
		
		 
//		4. continue statement means skip next process nad go to next iteration
		
//		for(int i=0;i<5;i++ ) {
//			
//		if(i==2) {
//			System.out.println("end loop");
//			continue;
//		}
//		System.out.println(i);
//		System.out.println("java is great");
//		}
//		output =
//				0
//				java is great
//				1
//				java is great
//				end loop
//				3
//				java is great
//				4
//				java is great
		
	//	5. do
			
		int i =0;
		do {
			i++;
			
			
		if(i==2) {
			System.out.println("end loop");
			continue;
		}
		System.out.println(i);
		System.out.println("java is great");
		
		  }while(i<5);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
