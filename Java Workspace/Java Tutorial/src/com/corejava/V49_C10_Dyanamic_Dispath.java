
class One{
	
	public void greet() {
		System.out.println("Good Morinng");
	}
	public void name() {
		System.out.println("My name is java");	
	}
}

class Two extends One{
	public void swagat() {
		System.out.println("Aapka swagat hain");
	}
	
	public void name() {
	System.out.println("My name is java in class two");
}
}
public class V49_C10_Dyanamic_Dispath {
	public static void main (String[]args) {
		
		//One obj= new One();
		//obj.name();      // op = my name is java
		
		One obj= new Two();   // super class= sub class , yes it is allowed
		obj.greet();                //OP= good morning
		
		obj.name();                // method will be run for object class not for reference class
		                           //OP= MY NMAE IS JAVA IN CLASS TWO
		obj.swagat();                  // NOT ALLOWED
}
	

}
