
import java.util.HashSet;

public class V95_Hash_Set {
	public static void main(String[]args) {
	 
		HashSet <Integer> my= new HashSet<> (6,0.5f);
		
		my.add(6);
		my.add(8);
		my.add(10);
		my.add(15);
		System.out.println(my);
		  // op = [8, 10, 6, 15]  
	}

}
