import java.util.ArrayList;
import java.util.LinkedList;

public class V92_Linked_LIstjava {
	public static void main(String[]args) {

LinkedList<Integer> l1 =new LinkedList<>(); 	
	LinkedList<Integer> l2 =new LinkedList<>();
	
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
	
	l1.addAll(0,l2); 
	
	l1.addLast(589);
	l1.addFirst(1002);       // linkedlist method ADDFIRAST AND ADDLAST
	                            // 1002 ,566 ,16 ,19 ,6 ,5 ,6 ,7 ,4 ,6 ,5 ,589 ,

	for(int i=0; i<l1.size(); i++) {
		System.out.print(l1.get(i)); 
		System.out.print(" ,");     

	}
}
}