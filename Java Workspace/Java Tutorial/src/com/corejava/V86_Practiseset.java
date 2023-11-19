import java.util.Scanner;

// VIDEO 86 PRACTISE SET


public class V86_Practiseset {
  public static void main(String[] args) {
	  //problem 1
	  // syntax error= int a=7
	  
//	  int age=78;
	 // int year born =2000-78 ;  /// logical erro
	
		// problem 2		  
			  
			try {
				int a= 666/0;
			}
			  catch(IllegalArgumentException e){
				  System.out.println("hehe");
			  }
			  catch(ArithmeticException e) {
				  System.out.println("haha");
			  }
			//     op = haha
			  
	// problem 3
			boolean flag= true;
			int [] marks=new int[3];
			
			marks[0]= 1;
			marks[1]= 56;
			marks[2]= 6;
			
			Scanner sc= new Scanner(System.in);
					int index;
			int i=0;
			
			while(flag && i<5) {
				try {
					index =sc.nextInt();
					System.out.println("the value of marks index is" +marks[index]);
				}
				catch(Exception e){
					System.out.println(" invalid index");
			i++;
				}
				if(i>=5) {
					System.out.println("error");
				}
			}  
//			op =haha
//			5
//			 invalid index
//			4
//			 invalid index
//			6
//			 invalid index
//			9
//			 invalid index
//			5
//			 invalid index
//			error

  }
}
