 //1. WITHOUT CONSTRUCTOR

//			  class MyMainEmployee{                                   // class creation
//			        private int id;
//			         private String name;
//			         
//			            
//					  public String getName() {
//						    return name;
//					  }
//					  public void setName(String n) {
//						    name=n;
//					  }
//					  public void setId(int i) {
//						     id= i;
//					  }
//					  public int getId() {
//						    return id;
//					  }
//					
//					  }
//							
//			  public class V42_Ch9_Constructor {                             // public class
//					public static void main(String[] args) {                 // MAIN METHOD
//					
//				  MyMainEmployee harry= new MyMainEmployee();                       // instantiating a  new Employee  object creation
//				    
//	             	harry.setId(34);                             //SETTING THE ATTRIBUTES
//				  harry.setName("CodeWithHarry");
//				  System.out.println(harry.getName());
//				  System.out.println(harry.getId());
//				  
//				 // output= CodeWithHarry
//                 34


				  //2. WITH CONSTRUCTOR

//				  class MyMainEmployee{                                   // class creation
//				        private int id;
//				         private String name;
//				         
//				         public MyMainEmployee() {                        // MyMainEmployeemethod creation
//				        	 id =45;
//				        	 name= "Rajashree Patil";
//				         }
//						  public String getName() {
//							    return name;
//						  }
//						  public void setName(String n) {
//							    name=n;
//						  }
//						  public void setId(int i) {
//							     id= i; 
//						  }
//						  public int getId() {
//							    return id;
//						  }
//						
//						  }
//								
//				  public class V42_Ch9_Constructor {                             // public class
//						public static void main(String[] args) {                 // MAIN METHOD
//						
//					  MyMainEmployee harry= new MyMainEmployee();                       // instantiating a  new Employee  object creation
//					    
//			    //       harry.setId(34);                      //WITHOUT SETTING ATTRIBUTES
//				//	  harry.setName("CodeWithHarry");
//					  System.out.println(harry.getName());
//					  System.out.println(harry.getId());
//					  
					  // OUTPUT
//					  Rajashree Patil
//					  45
				

       // 3. CONSTRUCTOR WITH ARGUMENTS

//					  class MyMainEmployee{                                   // class creation
//					        private int id;
//					         private String name;
//					         
//					
//					         
//					         public MyMainEmployee(String myName) {     // psssing arguments
//					        	 id =45;
//					        	 name= myName;
//					         }
//							  public String getName() {
//								    return name;
//							  }
//							  public void setName(String n) {
//								    name=n;
//							  }
//							  public void setId(int i) {
//								     id= i;
//							  }
//							  public int getId() {
//								    return id;
//							  }
//							
//							  }
//									
//					  public class V42_Ch9_Constructor {                             // public class
//							public static void main(String[] args) {                 // MAIN METHOD
//							
//						  MyMainEmployee harry= new MyMainEmployee("CodeWithHarry");                       // instantiating a  new Employee  object creation
//						    
//						  System.out.println(harry.getName());
//						  System.out.println(harry.getId());

   //output =  
		//				  CodeWithHarry
			//			  45	
			
						  ///4
						  
						  class MyMainEmployee{                                   // class creation
						        private int id;
						         private String name;
						         
						  /*       public MyMainEmployee() {
						        	 id =45;
						        	 name= "Rajashree Patil";
						         } */
						         
						         public MyMainEmployee(String myName,int myId) {     // psssing arguments
						        	 id =myId;
						        	 name= myName;
						         }
								  public String getName() {
									    return name;
								  }
								  public void setName(String n) {
									    name=n;
								  }
								  public void setId(int i) {
									     id= i;
								  }
								  public int getId() {
									    return id;
								  }
								
								  }
										
						  public class V42_Ch9_Constructor {                             // public class
								public static void main(String[] args) {                 // MAIN METHOD
								
							  MyMainEmployee harry= new MyMainEmployee("CodeWithHarry",12);                       // instantiating a  new Employee  object creation
					
							  System.out.println(harry.getName());
							  System.out.println(harry.getId());
							  output=
									  CodeWithHarry
									  12



					}

}
