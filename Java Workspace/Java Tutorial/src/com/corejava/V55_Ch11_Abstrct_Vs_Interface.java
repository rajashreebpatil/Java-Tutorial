

interface Bicycle{                            // interface
	int a =45;                       // proprties in interfaces as they are final cacnot modify
	void applyBrake(int decrement);
	void speedUp(int increment);
}
 interface  HornBicycle{                            // we can use multiple interfaces
	                      // proprties in interfaces as they are final cacnot modify
	void blowHorn();                 // methods
	void flewHorn();
}
 
  class AvonCycle implements Bicycle , HornBicycle{
  void vehicleHorn() {
	  System.out.println("peepee poo poo");
  }
 public  void applyBrake(int decrement) {                 //while usimg interface method use public method to implement
	  System.out.println("applying brakes");
  }
	public void speedUp(int increment) {
		System.out.println("applyibg speedup");
	}
	public void blowHorn() {
	System.out.println("kabhi hushi kabhi gum");
  }
  public void flewHorn() {
	  System.out.println(" Mein hoon na pee poo");
  }
  }
  
public class V55_Ch11_Abstrct_Vs_Interface {
 public static void main (String[]args) {
	 
	 AvonCycle harry=  new AvonCycle ();
	 harry.applyBrake(1);                    //op = applying brakes
	 // you can create properties in interface
	 System.out.println(harry.a);             // op=45
	 
	 // you cannot modify the propeerties in interfcaes as they are final
	 
	  harry.blowHorn();
	  harry.flewHorn();
/*	  // OP =applying brakes
			  45
			  kabhi hushi kabhi gum
			   Mein hoon na pee poo*/
		 }
 
}
