
@FunctionalInterface
     interface myFunctionalInterface{
	void thisMethod();
	void thisMethod2();	
}


 class Two extends One{
	@Override
	 public void greet() {
	 System.out.println("good  morning");
	}
	
@Deprecated
	public int  sum(int a, int b) {
	return a+b;
		
}
 }
	 
	 

public class V108_Annotation {
	@SuppressWarnings("deprecation")       // used to control the voice/ warning of software
public static void main(String[] args) {
	
	Two c = new Two();
	
	c.greet();
	c.sum(5, 4);
	
	
}
}
