//
//    class Base1 {
//    	int x;
//    	
//    	// CONSTRUCTOR 
//    	
//    	Base1(){
//    		System.out.println("I am a constructor");
//    	}
//    	
//     
//    	// METHODS      
//    	
//    	public int getX() {
//			return x;
//		}
//
//		public void setX(int x) {
//			this.x = x;
//		}
//    }
//    
//  class Derived1 extends Base1{
//	  int y;
//	  
//	  // CONSTRUCTOR
//	 Derived1(){
//		System.out.println("I am Derived claas constructor");
//	 }
//  
//	  public int getY() {
//		return y;
//	}
//
//	public void setY(int y) {
//		this.y = y;
//	}
//
//  }
//public class V46_ch10_Constructor { 
//	public static void main(String[]args) {
//
//		// CREating object of base clASS
//		
//		Base1 b= new Base1();
//	Derived1 d=new Derived1();                         // OUTPUT==I am a constructor
//																//m Derived claas constructor
//	}
//
//}
//   
//     type 2


    class Base1 {
    	int x;
    	
    	// CONSTRUCTOR 
    	
    	Base1(){
    		System.out.println("I am a constructor");
    	}
    	Base1(int a){
    	   System.out.println("I am an overloaded constructor with value of a as:" +a);
    }
    }
    
  class Derived1 extends Base1{
	  
	  
	  // CONSTRUCTOR
	  
	 Derived1(){
		 super(0);                 // super keyword is used to shows argumets
		System.out.println("I am Derived claas constructor");
	 }
      Derived1 (int a, int b){
    	  super(a);
        System.out.println("I am overloaded constructor of Derived with value of b as:"+b);
  }
	
  }
  
  
public class V46_ch10_Constructor { 
	public static void main(String[]args) {

		// CREating object of base clASS
		
		Base1 b= new Base1();
	Derived1 d=new Derived1();                         
	Derived1 cd= new Derived1(14,9)	;												
	}

}
//op
//I am a constructor
//I am an overloaded constructor with value of a as:0
//I am Derived claas constructor
//I am an overloaded constructor with value of a as:14
//I am overloaded constructor of Derived with value of b as:9

     



















