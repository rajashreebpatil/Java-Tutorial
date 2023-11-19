

class A{
	public int a;
	
	public int harry() {
		return 4;
			}
	
	public void meth2() {
		System.out.println(" I am menthod 2 of class A");
	}
}

class B extends  A{
	@Override                 // SAME METHOD IMPLEMENT FROM PARENT CLASS
	public void meth2() {
		System.out.println(" i am method 2 of class b");
	}
	public void meth3() {
		System.out.println(" I am method 3 of class B");
	}
}



public class V48_CH10_Method_Override {
	public static void main(String[]args) {
		
		A a = new A();
		a.meth2();
		
		B b = new B();
		b.meth2();
	}

}

// OP=   I am menthod 2 of class A
//  i am method 2 of class b
