 // VIDEO 44 - PROBLEM 1= CREATE CLASS CYLINDER  & USE SETTERS AND
//   GETTERSS TO SET IN ITS RADIUS ANFD HEIGHT
   
     //  1. GETTERS AND SETTERS

//     class Cylinder{                               // CUSTOM CLASS
//	   private  int radius;
//	    private   int height;            // PRIVATE CLASS HENCE WE USE GETTER AND SETTERS
//	   

//	   public int getRadius() {        // FOR GETTER AD SETTER USE SHORT CYT ALT+INSERT
//	   return radius;
//	   }
//	   public void setRadius(int i) {
//		   this.radius= i;
//	   }
//	   public int getHeight() {
//		   return height;
//		   }
//	  public void setHeight(int height) {
//			   this.height = height;
//		   }
//	  
//	  
//	  // PROBLEM 2  =CALCULATE SURFACE AREA AND VOLUME OF CYLINDER
//	  
////	  public double surfaceArea() {
////		  return 2*3.142 * radius *radius +2*3.142*radius*height;
////	  }
////	  public double volume() {
////		  return 3.142*radius * radius * height;
////	  }
//	   public double surfaceArea() {                  // FOR BETTERRESULT USE Math.PI function
//		  return 2*Math.PI * radius *radius +2*3.142*radius*height;
//	  }
//	  public double volume() {
//		  return Math.PI*radius * radius * height;
//	  }
//      }
//     
//      public class V44_Ch9_Problem {
//    	  public static void main(String[] args) {      // MAIN METHOD 
//    		  
//      Cylinder ballon=new Cylinder();
//    		  
//    		  ballon.setHeight(12);
//			System.out.println(ballon.getHeight());
//			 ballon.setRadius(9);
//				System.out.println(ballon.getRadius());
//				
//				// PROBLEM 2
//				System.out.println(ballon.surfaceArea());
//				System.out.println(ballon.volume());
//		}
//      }
//  // OUTPUT =9                    OUTPUT = 1187.6122
// //     45                                =3053.62
      
     
 //     PROBLEM USE A  USING CONSTRUCTOR
      
//     class Cylinder{                               // CUSTOM CLASS
//	   private  int radius;
//	    private   int height;            // PRIVATE CLASS HENCE WE USE GETTER AND SETTERS
//	   
//	    
//	   public Cylinder(int radius, int height) {            // CONSTRUCTOR
//			super();
//			this.radius = radius;
//			this.height = height;
//			
//		}
//	public int getRadius() {                  // FOR GETTER AD SETTER USE SHORT CYT ALT+INSERT
//	   return radius;
//	   }
//	   public void setRadius(int i) {
//		   this.radius= i;
//	   }
//	   public int getHeight() {
//		   return height;
//		   }
//	  public void setHeight(int height) {
//			   this.height = height;
//		   }
//	  
//	   public double surfaceArea() {
//		  return 2*3.142 * radius *radius +2*3.142*radius*height;
//	  }
//	  public double volume() {
//		  return 3.142*radius * radius * height;
//	  }
////      public double surfaceArea() {                  // FOR BETTERRESULT USE Math.PI function
////		  return 2*Math.PI * radius *radius +2*3.142*radius*height;
////	  }
////	  public double volume() {
////		  return Math.PI*radius * radius * height;
////	  }
//      }
//     
// 
//      public class V44_Ch9_Problem {
//    	  public static void main(String[] args) {      // MAIN METHOD 
//    		  
//      Cylinder ballon=new Cylinder(9,12);
//    		  
//    		//  ballon.setHeight(12);
//			System.out.println(ballon.getHeight());
//			
//			// ballon.setRadius(9);
//				System.out.println(ballon.getRadius());
//				
//				// PROBLEM 2
//				System.out.println(ballon.surfaceArea());
//				System.out.println(ballon.volume());
//		}
//      }
//      
  // OUTPUT =9                    OUTPUT = 1187.6122
 //     45                                =3053.62
	   
      // PROBLEM 4= OVERLOAD CONSTRUCTOR USED TO RECTANGLE BREADTH 5 AND LENGTH 4 USING CUSTOM PARAMETERR
      
   class Rectangle{                                  // class
	   private int length;
	   private int breadth;
	   
	public Rectangle() {                             // constructor
		
		length = 4;
		breadth = 5;
	}

	public Rectangle(int length, int breadth) {                // custom constructor
		super();
		this.length = length;
		this.breadth = breadth;
	}

	public int getLength() {                            //getter and etters
		return length;
	}

	public int getBreadth() {
		return breadth;
	}   
   }
   
   
   public class V44_Ch9_Problem {
 	  public static void main(String[] args) {          // MAIN METHOD 
  
 		      Rectangle r= new Rectangle();
 		      Rectangle r1= new Rectangle(12,56)	;  
 		      
 		    		  System.out.println(r.getLength());
 		      System.out.println(r.getBreadth());

 		     System.out.println(r1.getLength());
		      System.out.println(r1.getBreadth());

 	  }
 	  }
   op=
		   4
		   5
		   12
		   56




