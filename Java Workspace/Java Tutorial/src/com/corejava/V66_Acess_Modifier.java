
 class C1{
	 public int x= 5;
	 protected int y=48;
	 int z=8;
	 private int a= 85;
			 
	public void meth1() {                       // in same classx
		 System.out.println(x);
		 System.out.println(y);
		 System.out.println(z);
		 System.out.println(a);
	 }
 }



public class V66_Acess_Modifier {
 public static void main(String[]args) {
	 
	 C1 c = new C1();
	// c.meth1();
	 
	 System.out.println(c.x);            // in same package
	 System.out.println(c.y);
	 System.out.println(c.z);
	 //System.out.println(c.a);    // because it is private
	 
 }
}
