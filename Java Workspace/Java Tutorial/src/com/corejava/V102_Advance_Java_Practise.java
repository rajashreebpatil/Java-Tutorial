import java.util.Date;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;

// VIDEO 102 = CREATE AN ARARYLIST AND STORE A0 STUDENT NAME

public class V102_Advance_Java_Practise {
public static void main(String[] args) {
	
	// QUESt = 1
	
	ArrayList ar= new ArrayList();
	
	ar.add("student 1");
	ar.add("student 2");
	ar.add("student 3");
	ar.add("student 4");
	ar.add("student 5");
	ar.add("student 6");
	ar.add("student 7");
	ar.add("student 8");
	ar.add("student 9");
	ar.add("student 10");
	
	for(Object o: ar) {
		System.out.println(o);
	}
	
	
	// que 5 - CREATE SET IN JAVA AND STORE DUPLICAE ELEMENTS
	
	HashSet<Integer> s = new HashSet<Integer>();
	s.add(5);
	s.add(6);
	s.add(10);
	s.add(9);
	s.add(8);
	s.add(6);
	
	System.out.println(s);
	// op [5, 6, 8, 9, 10]         // NOT REPEATING VALUES
	
	
	
	//QUES 2 =  USE DATE CLASS AND PRINT TIME IN FORMAT 10:02:50
	
	  Date  d= new  Date();
	  System.out.println(d.getHours() + ":" +d.getMinutes() +":" + d.getSeconds());
	  
	    //op = 21:29:41
	  
	  
	  // que 3 = quest 2 by using calendar class
	  
	  
	 Calendar c = Calendar.getInstance();
	 System.out.println(c.get(Calendar.HOUR) + ":" + c.get(Calendar.MINUTE) +":" + c.get(Calendar.SECOND));
	  
	  // op = 9:34:25
	  
	 
	  // QUE 5= QUE 2 BY USING JAVA.TIME API
	 LocalDateTime m =LocalDateTime.now();                     // THIS IS DATE 
	
	  DateTimeFormatter g = DateTimeFormatter.ofPattern(" H:m:s");      // THIS  IS FORMAT
	  String myDate = m.format(g);
	  System.out.println(myDate);
	  
	  // op  21:42:42
	  
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
