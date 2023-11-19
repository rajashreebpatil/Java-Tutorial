
public class V28_Ch6_Array {
     public static void main(String[]args) {
    	 
//    	 int [][] flats;
//    	 flats =new int [2][3];
//    	 
//    	 flats[0][0]=101;
//    	 flats[0][1]=102;
//    	 flats[0][2]=103;
//    	 flats[1][0]=201;
//    	 flats[1][1]=202;
//    	 flats[1][2]=203;
//    	 
//    	 // DISPLAYING 2D ARRAY (FOR LOOP);
//    	  System.out.println("printing 2d ARRAY USING FOR LOOP");
//    	  
//    	  for(int i=0 ; i<flats.length ; i++) {
//    		  for(int j=0; j<flats[i].length; j++) {
//    		  System.out.print(flats[i][j]);
//    		  System.out.print(" ");
//    		    }
//    	 System.out.println();
//    
    	 
//     }

    	  
//    	  output =
//    			  printing 2d ARRAY USING FOR LOOP
//    			  101 102 103 
//    			  201 202 203 

     
     
     
	 int [][] flats= { {101 ,102,103},
	 {201,202,203},
	 };
	
	 
	 // DISPLAYING 2D ARRAY (FOR LOOP);
	  System.out.println("printing 2d ARRAY USING FOR LOOP");
	  
	  for(int i=0 ; i<flats.length ; i++) {
		  for(int j=0; j<flats[i].length; j++) {
		  System.out.print(flats[i][j]);
		  System.out.print(" ");
		    }
	 System.out.println();
	  }
     }
}
