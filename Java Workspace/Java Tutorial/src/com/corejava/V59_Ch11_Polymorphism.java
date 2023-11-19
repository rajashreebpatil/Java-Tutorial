interface Camera2{
	void  takeSnap();
	void recordVideo();  
	private void greet() {                            // private method
		System.out.println("Good mornonh");
	}
	default void record4kVideo() {                          ///default method can be implemented in subclass
		greet();
		System.out.println("Recording ");
	}
}
   
    
   interface Wifi2{
	 String[] getNetwork();
	 void connectToNetwork(String network);
 }
   
  class MyCellPhone2{
	 void  callNumber(int phoneNumber) {
		 System.out.println("calling" + phoneNumber);
	 }
	 void pickCall() {
		 System.out.println("Connecting... ");
	 }
  } 
	 
class MySmartPhone2 extends MyCellPhone2 implements Camera2, Wifi2{
		  public void takeSnap() {
			  System.out.println("Taking Snap");
		  }
		  
		  public void recordvideo() {
			  System.out.println(" recording");
		  }
		  
//		  public void record4kVideo() {
//			  System.out.println("Recording in 4k");
//		  }
		  
		  public String[] getNetworks() {
			  System.out.println("Getting list of networks");
			  String [] networkList= { "harry", "anhjali"};
			  return networkList;
			  }
		  
		  public void connectToNetwork(String network) {
			  System.out.println("connecting to" + network);
		  }
		  public void sampleMeth() {
			  System.out.println("meth");
		  }
 }
 
public class V59_Ch11_Polymorphism{
public static void main(String[] args) {
	
	//object 1
	
	Camera2 cam = new MySmartPhone2();                //THIS IS SMARTPHONE BUT USE IT AS A CAMERA
	//cam.getNetwork();                         // not allowed. it will  implement only camera mathod
	// cam.sampleMeth();                            // not alloewed
	 cam.record4kVideo();                    // allowed    op= Good mornonh
	                                                           // Recording     
	 
	 // object 2
	 
	MySmartPhone2 ms = new MySmartPhone2(); 
	ms.record4kVideo();
   String[] ar=  ms.getNetworks();
   
   for (String item:  
	   ar) {
	   System.out.println(item );
   }
}
}

 /* op Good mornonh
  Recording 
  Getting list of networks
  harry
  anhjali*/




