
@FunctionalInterface
interface DemoAno{
	void meth1(int a);
	//void meth2();
}
//  class HarryFunc implements DemoAno{
//	  @Override
//	  public void meth1() {
//		  System.out.println("i am meth 1");
//  }
//  }

//  class AnonyDemo implements DemoAno{
//	  public void display() {
//		  System.out.println("HELLO");
//	  }
//	  
//	  @Override
//	  public void meth1() {
//		  System.out.println("i am meth 1");
//	  }
//	  @Override
//	  public void meth2() {
//		  System.out.println("I am meth 2");
//	  }
//	  
//  }
//	  


public class V109_Anonymous_Lambda {
public static void main(String[] args) {
	
	
//	DemoAno obj=  new AnonyDemo();
//	obj.meth1();
	
	
	// ANONYMOUS CLASSS
	
//	DemoAno obj= new DemoAno() {             // DemoAno Anonymous class from DemoAno interface without craeting another class from it
//		
//		@Override
//		public void meth2() {
//			System.out.println("i ammeth 2");
//			
//		}
//		
//		@Override
//		public void meth1() {
//			System.out.println("I am meth 1");
//			
//		}
//	}; 
//	obj.meth1();
//	
	  // lambda Expression
	
//	DemoAno obj=  new HarryFunc();	
//	  obj.meth1();                        // op i am meth 1
//	
//	
	
	DemoAno obj=(a)->{
		System.out.println(" I am lambda method 1" + a);
	};
	obj.meth1(6);            // op  I am lambda method 16
	
	
}
}
