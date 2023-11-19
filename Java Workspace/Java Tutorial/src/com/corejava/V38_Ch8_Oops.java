
 // 1. BY CREATING CUSTOM CLASS


// CREATE CUSTOM CLASS
//	
//         class Employee{                                   // class creation
//        	 int id;
//         String name;
//            
//         }
//		
//      public class V38_Ch8_Oops {                               // public class
//	
//    	public static void main(String[] args) {                 // MAIN METHOD
//	
//		System.out.println("This is our custom class");
//		
//		
//	  Employee harry= new Employee();                       // instantiating a  new Employee  object creation
//	    
//	  // SETTING THE ATTRIBUTES
//	   harry.id =12;
//	    harry.name= "CODE WITH HARRY";
//	    		
//	   // PRINTING THE ATTRIBUTES
//		     System.out.println(harry.id);
//		   System.out.println(harry.name);
												   /*	output=	          This is our custom class
														          12
														          CODE WITH HARRY*/

		   
		 // 2. BY CREATING CUSTOM CLASS AND METHODS
		   
		// CREATE CUSTOM CLASS
			
	         class Employee{                                   // class creation
	        	 int id;
	        	 int salary;
	         String name;
	         
	      public  void logic() {                             // method 1
	    	System.out.println("My id is "+ id);  
	    	System.out.println("My name is "+ name);
	       }
	      public int getSalary() {
	    	  return salary;
	      }
	        }
			
	      public class V38_Ch8_Oops {                               // public class
		
	    	public static void main(String[] args) {                 // MAIN METHOD
		
			System.out.println("This is our custom class");
			
		  Employee harry= new Employee();
		  Employee john= new Employee();   // instantiating a  new Employee  object creation
		  
		  
		    
		  // SETTING THE ATTRIBUTES
		   harry.id =12;
		    harry.name= "CODE WITH HARRY";
		    harry.salary= 34;
		    john.salary = 12;
		    john.id=15;
		    john.name=  " jogn cbdhc";
		    
		    harry.logic();
		    john.logic();
		   int c= harry.getSalary();
		     System.out.println(c);
		     int d= john.getSalary();
		     System.out.println(d);
		     
//		     
//		     This is our custom class
//		     My id is 12
//		     My name is CODE WITH HARRY
//		     My id is 15
//		     My name is  jogn cbdhc
//		     34
//		     12
		    
	
		    
	    	}
	}   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   


