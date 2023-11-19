import java.util.ArrayList;

public class V110_Generics {
public static void main(String[] args) {
	
 ArrayList<Integer> l1 = new ArrayList();
	// ArrayList <Int> l2 = new ArrayList();        // this int producean an error
	
	l1.add(54);
	l1.add(56);
	
	int a =l1.get(0);
	System.out.println(a);
	  // op =54
}
}
