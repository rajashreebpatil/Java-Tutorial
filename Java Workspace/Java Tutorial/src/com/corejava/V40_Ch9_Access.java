         // CH 9= ACCESS MODIFIERS= VIDEO 40

//
//			  class Myemployee{                                   // class creation
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
//						    id= i;
//					  }
//					  public int getId() {
//						    return id;
//					  }
//					
//					  }
//							
//								
//			      public class V40_Ch9_Access {                               // public class
//					public static void main(String[] args) {                 // MAIN METHOD
//					
//				  Myemployee harry= new Myemployee();                       // instantiating a  new Employee  object creation
//				    
//			//     harry.id =45;
//			//     harry.name=  "CodeWithHarry" -->       throw error due to private access modifier
//				  
//				  harry.setName("CodeWithHarry");
//				  System.out.println(harry.getName());
////				  
//				  output= CodeWithHarry
				  
				  
// 
//	 WE CAN ALSO USE THIS
	 
	                             class Myemployee{                                   // class creation
						        private int id;
						         private String name;
						         
						            
								  public String getName() {
									    return name;
								  }
								  public void setName(String n) {
									  this.name=n;
								  }
								  public void setId(int i) {
									    this.id= i;
								  }
								  public int getId() {
									    return id;
								  }
								}
										
											
						      public class V40_Ch9_Access {                               // public class
								public static void main(String[] args) {                 // MAIN METHOD
								
							  Myemployee harry= new Myemployee();                       // instantiating a  new Employee  object creation
							    
						//     harry.id =45;
						//     harry.name=  "CodeWithHarry" --> throw error due to private access modifier
							  
							  harry.setName("CodeWithHarry");
							  System.out.println(harry.getName());
							  
							  
			OUTPUT =CodeWithHarry
		}  
}
