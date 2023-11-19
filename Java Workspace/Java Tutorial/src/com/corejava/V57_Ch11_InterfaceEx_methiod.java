   

interface Camera{
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
   
    
   interface Wifi{
	 String[] getNetwork();
	 void connectToNetwork(String network);
 }
   
  class MyCellPhone{
	 void  callNumber(int phoneNumber) {
		 System.out.println("calling" + phoneNumber);
	 }
	 void pickCall() {
		 System.out.println("Connecting... ");
	 }
  } 
	 
class MySmartPhone extends MyCellPhone implements Camera, Wifi{
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
 }
 
public class V57_Ch11_InterfaceEx_methiod {
public static void main(String[] args) {
	
	MySmartPhone ms = new MySmartPhone(); 
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
