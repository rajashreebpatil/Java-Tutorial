
class EkClass{
	int a;
	
	EkClass(int a){
		this.a=a;
			}
	
	public int getA() {
		return a;
	}
	public int returnone() {
		return 1;
	}
}

class DoClass extends EkClass{
	DoClass(int c){
		super(c);
		System.out.println("I am a constructor");
		
			
	}
} 
public class V47_Ch10_This_Super {
	public static void main (String []args) {
		 
		EkClass e= new EkClass(65);
		DoClass d= new DoClass(5);
		System.out.println(e.getA());
		
	}

}

// OP - I AM A CONSTRUCTOR
    //  65
