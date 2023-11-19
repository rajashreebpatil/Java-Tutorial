

import java.util.*;


public class V91_Arraylist_Demo {
public static void main(String[]args) {
	
	ArrayList<Integer> l1 =new ArrayList<>(); 	
	ArrayList<Integer> l2 =new ArrayList<>(5);
	
	l2.add(15);
	l2.add(16);
	l2.add(19);
	
	l1.add(6);                                 
	l1.add(7);
	l1.add(4);
	l1.add(6);
	l1.add(5);
	
	l1.add(0,5);
	l1.add(0,6);
	
	l1.addAll(0,l2);                                // op = 15,16,16,6,5,6,7,4,6,5
	//l1.clear();
	System.out.println(l1.contains(7));       // true
	System.out.println(l1.indexOf(7));  
	                                             // op =6
	System.out.println(l1.indexOf(6));             // op =3
	System.out.println(l1.lastIndexOf(6));        //op=  8
	
	l1.set(1,  566);                        //opm=   15 ,566 ,19 ,6 ,5 ,6 ,7 ,4 ,6 ,5 , 
	for(int i=0; i<l1.size(); i++) {
		System.out.print(l1.get(i)); 
		System.out.print(" ,");     // op = 15 ,16 ,19 ,6 ,5 ,6 ,7 ,4 ,6 ,5 ,
		
	                                           /*op=   6
		                                          5
													6
													7
													4
													6
													5 */
		
		

	}
	
}
}
	
	
	
	
	
	

