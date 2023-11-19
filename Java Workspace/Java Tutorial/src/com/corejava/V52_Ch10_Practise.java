// CREATE A CLASS CIRCLE AND USE INHERITANCE TO CREATE ANOTHER  CLASS CYLINDER  FROM IT.
 
 class Circle{
	 public int radius;
	 
	 Circle(){
		 System.out.println(" I am non para constructor of circle");
	 }
	 
	 Circle(int r){
		 System.out.println(" I am para. constructor of circle");
		 this.radius= r;
	 }
	 
	 public double area() { 
		 return Math.PI*this.radius*this.radius;
		 
	 }
 }
   
 
 class Cylinder1 extends Circle{
	 public int height;
	  
	 Cylinder1(int r, int h){
		 super (r);
		 System.out.println(" I am cylinder1 para. constructor");
		 this.height = h;
		 }
	 
	  public double volume() {
		  return Math.PI*this.radius*this.radius*this.height;
	  }
	  
 }
public class V52_Ch10_Practise {
	public static void main(String[]args) {
		
		// problem 1
		// Circle objc = new Circle(12);    // op=  I am para. constructor of circle
		 
		 Cylinder1 obj=new Cylinder1(12,4);   //op=  I am para. constructor of circle
		                                               // I am cylinder1 para. constructor
	}

}
