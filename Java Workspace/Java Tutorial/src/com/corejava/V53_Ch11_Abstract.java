abstract class Parent2{              // abstract class
	
	  Parent2() {                                    // constrcuctor
		 System.out.println(" I am Base2's constructor");
     }
	 public void sayHello() {
            System.out.println("hello");
    }
	 abstract public void greet() ;                       // abstract method
	 abstract public void greet2();
	 
}
  class Child2 extends Parent2{                     // concrete subclass
	  @Override
	   public void greet() {
		  System.out.println("GOOD MORNING");
	  }
	  @Override
	  public void greet2() {
		System.out.println("Good Afternoon") ;
		   }
  }
  
  abstract class Child3 extends Parent2{                    // abstract class 
	  public void th() {
		  System.out.println("I am Good");
		  }
	  }
public class V53_Ch11_Abstract {
	public static void main(String[]args) {
		
		//Parent2 p = new Parent2();        // throw error because we cannot make abstract object from abstract class
		
	//	Child3 c3 = new Child3();              // thro errou
		
		Child2 d = new Child2();
		
		d.greet();
		d.greet2();   //OP =  I am Base2's constructor
							//	GOOD MORNING
						// 	Good Afternoon

	}

}
