import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

// VIDEO 101 - DATE TIME FORMATTER


     public class V101_Date_time_Formatter {
     public static void main(String[] args) {
	
	
	LocalDateTime m =LocalDateTime.now();                     // THIS IS DATE 
	System.out.println(m);
	
  DateTimeFormatter d = DateTimeFormatter.ofPattern("dd-MM-yyyy--E H:m a");      // THIS  IS FORMAT
  DateTimeFormatter d1 = DateTimeFormatter.ISO_LOCAL_DATE;

	//String myDate = m.format(d);    
	String myDate = m.format(d);//  CREATINF DATE STRING USING DATE AND FORMAT
	System.out.println(myDate);
	
	// OP =2023-11-15T20:33:24.686826300
	// 15-11-2023--Wed 20:33 pm
	
}
}
