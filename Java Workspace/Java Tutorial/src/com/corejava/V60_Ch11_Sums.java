/* // 1. create abstract class pen and method refill(), write() abstract method

abstract class Pen {                        // ABSTRACT CLASS
	abstract void write();
	abstract void refill();
}

 class FountainPen extends Pen {
	 void write() {
		 System.out.println("Write");
	 } 
	 void refill() {
		 System.out.println("refill");
	 }
	 void changeNib() {
		 System.out.println("change the nib");
	 }
 }

public class V60_Ch11_Sums {
	public static void main(String[]args) {
		FountainPen  s= new FountainPen();
		
		s.refill();                               //op=refill
				                                  //change the nib
		s.changeNib();
	}
}*/

  //Q.2 create class monkey and method jump and bite and class human inherits monkey class and implement basic animal interface

  class Monkey{
	 public  void jump() {
		  System.out.println("jumping");
	  }
	    void bite() {
		  System.out.println("biting");
	  }
  }
  
   interface BasicAnimal{
	 void eat();
	 void sleep();
   }
  
  class Human extends Monkey implements BasicAnimal{
	   void speak() {
		  System.out.println("speakin");
	  }
	  public void eat() {
		  System.out.println("eating");
	  }
	  public void sleep() {
		  System.out.println("sleeping");
	  }
  }
  
  public class V60_Ch11_Sums {
		public static void main(String[]args) {
	// Q  no 3
			
	Human harry= new Human();
	harry.sleep();             
	harry.speak();
	harry.eat();
	
		
		 /*op= sleeping
				speakin
				eating*/

  // Q .5 DEMONSTRATE  POLYMORPHISM  USING MONKEY CLASS
  
   Monkey m1= new Human();
    // m1.speak();  // cannot use speak method because the referance is monkey whisvh does not have speak method
     
     m1.jump();                   // op = jumping 
     
     BasicAnimal lovish= new Human();
   //  lovish.speak();             // error
     lovish.eat();
     lovish.sleep();                 //  op= eating
    		                 //       sleeping
   
     
     
     
		}
  }