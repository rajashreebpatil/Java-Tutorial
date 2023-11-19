
public class V29_Ch6_array {
	public static void main(String[]args) {
		
		// 1. PROBLEM =SUM OF 5 FLOATS
//		1. by using for loop using array
//		
//	    float sum=0;
//		float [] marks= {10.0f,5.0f ,20.0f, 10.0f,20.0f};
//		 
//		for(int i=0; i<marks.length; i++) {
//			sum= sum + marks[i];
//		}
//		System.out.println("the sum of no");
//		System.out.println(sum);
//		
//		
//		output 
//		the sum of no
//		65.0
//		
	//	2. arrays by using for each loop
		
//		float [] marks= {10.0f,5.0f ,20.0f, 10.0f,20.0f};
//		
//		float sum=0;
//		
//		for(float element: marks) {
//			sum=sum+element;
//		}
//		System.out.println("the sum of no");
//		System.out.println(sum);
//		
//		output=  
//				the sum of no
//				65.0

//		3. problem = find average by for each loop
				
//				float [] marks= {10.0f,5.0f ,20.0f, 10.0f,20.0f};
//		
//				float sum=0;
//				
//				for(float element: marks) {
//					sum=sum+element;
//				}
//				System.out.println("the sum of no");
//				System.out.println(sum/marks.length);
//				
//				output =13
		
		
	//	problem 4=
				
//				float [] marks= {10.0f,5.0f ,20.0f, 10.0f,20.0f};
//		     
//				float num= 10.0f;
//				boolean isInArray = false;
//				
//				for(float element:marks) {
//					if(num==element){
//					isInArray=true;
//					break;
//				}
//				}
//				if(isInArray) {
//					System.out.println("the value is present");
//				}
//				else {
//					System.out.println("not present");
//				}
//				output the value is present
		 
		
		
  //                   problem 4 = add 2matrices of 2x3 size
                    		 
//           int [][] mat1= { { 1 , 2, 3 },
//        		             { 4,5, 6}};  // Row -2 , column -3
//        		             
//        	int [] [] mat2=  { {2,6 ,13},
//        			          { 3, 7 ,1 }};
//        		             
//        	int [][] result= { { 0,0,0},
//        			           {0 ,0,0 }};
//           
//      for( int i=0 ; i<mat1.length ; i++) {     // row number of times
//    	   for( int j=0 ; j<mat1[i].length ; j++) {   // column no of time
//    		   System.out.format("setting value for i=%d & j=%d\n" , i,j);
//    		   result[i][j]= mat1[i][j] +mat2[i][j];
//    	   }
//      }
//    	// Printing element of 2d ARRAY
//      for( int i=0 ; i<mat1.length ; i++) {     // row number of times
//   	   for( int j=0 ; j<mat1[i].length ; j++) {   // column no of time
//   		   System.out.print(result[i][j] + " ");
//   		   result[i][j]= mat1[i][j] +mat2[i][j];
//   	   }
//   	   System.out.println(" ");
//      }	  
//      
//        OUTPUT =setting value for i=0 & j=0
//        		setting value for i=0 & j=1
//        		setting value for i=0 & j=2
//        		setting value for i=1 & j=0
//        		setting value for i=1 & j=1
//        		setting value for i=1 & j=2
//        		3 8 16  
//        		7 12 7  
		
		
	//	PROBLEM 5= REVERSE ARARY
				
//     int a= Math.floorDiv (5,2);
//		System.out.println(a);
//		
//		output=2
    		   
//		
//		int[] arr= { 1,2,3,4,5,6};
//		
//		for(int i= arr.length-1; i>=0;i--) {
//			System.out.println(arr[i]);
//		} output-= 
//				6
//				5
//				4
//				3
//				2
//				1
		
//		int[] arr= { 1,2,3,4,5,6};
//		int l= arr.length;
//		
//		int n= Math.floorDiv(l ,2);
//		int temp;
//		
//		for(int i=0 ; i<n ; i++) {
//			// swap a[i] & a[l-1-i]
//			// |4| |3|
//		
//			temp = arr[i];
//			arr[i]=arr [l-i-1];
//			arr[l-i-1]=temp;
//			}
//		
//		for(int element:arr) {
//			System.out.println(element);
//		}
//		output=6
//				5
//				4
//				3
//				2
//				1
				
		
//		problem 6= find maximum elememt
				
//		int [] arr= {1,2,3,455,55,85};
//		int max=0;
//		
//		for(int e:arr) {
//			if(e >max) {
//				max=e;
//			}
//		}
//		  System.out.println("the max valur "+ max);
//		  
//	output 	  the max valur 455
		
		
				
//				problem 7. find minimum elelmenr
		
//		int [] arr= {1,2,-3,4,5};
//		int min=arr[0];
//		
//		for(int e:arr) {
//			if(e <min) {
//				min =e;
//			}
//		}
//		  System.out.println("the min valur "+ min);
//		  
//		  output =the min valur -3
		
		
		
	//	PROBLEM 8= SORTED OR NOT
				
//	boolean isSorted=true;
//		
//		int[]arr= {1,2100,3,455,5,34,67};
//		
//		for(int i=0; i<arr.length-1; i++) {
//			if(arr[i]>arr[i+1]) {
//				isSorted= false;
//				break;
//			}
//		}
//		if(isSorted) {
//			System.out.println("the array is sorted");
//		}
//		else {
//			System.out.println("the arary is not sorted");
//		}
//		
//		output=the arary is not sorted
//				
//				
				
//	int[]arr= {41,2100,3,455,5,34,67};
//		int min = arr[0];
//		for(int i=0; i<arr.length-1; i++) {
//			if(arr[i]<min) {
//				min = arr[i];
//			}
//		}
//		System.out.println(min);
//				output=3
				
    		   
    	    	
		
                     
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
