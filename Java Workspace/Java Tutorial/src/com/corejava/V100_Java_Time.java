import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class V100_Java_Time {
public static void main(String[] args) {
	
	
	LocalDate d= LocalDate.now();
	System.out.println(d);
	
	LocalTime t= LocalTime.now();
	
	System.out.println(t); 
	
	// op -2023-11-15
	//16:06:38.114044300
	
	LocalDateTime m =LocalDateTime.now();
	System.out.println(m);
	 
	// op 2023-11-15
	// 16:12:26.724314
  //	2023-11-15T16:12:26.724314
	
	
}
}
