
class Base{
	int x;
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		System.out.println("I am in base and setting x now");
		this.x=x;
	}
	
	public void printMe() {
		System.out.println(" i am constructor");
	}
}
 

class  Derived extends Base{
	int y;

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
}


public class V45_ch10_Ineritance {
	public static void main(String[]args) {
		
		// CREATING OBJECT OF BASE CLASS
		Base b= new Base();
		b.setX(4);
		System.out.println(b.getX());
		
		//CREATING OBJECT OF DERIVED CLASS
	    Derived d = new Derived ();
		d.setX(43);
		System.out.println(d.getX());
	}

}
//utput-
//I am in base and setting x now
//4
//I am in base and setting x now
//43


