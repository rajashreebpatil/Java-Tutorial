
  // VIDEO 98 CALENDAR CLASSS IN JAVA

 // V98 - CALENDAR CLASS

import java.util.Calendar;
import java.util.TimeZone;

public class V98_Calendr {
public static void main(String[] args) {
	
	
/*	Calendar c = Calendar.getInstance();
	System.out.println(c.getCalendarType());
	System.out.println(c.getTimeZone());  */
	
	// opgregory
	//sun.util.calendar.ZoneInfo[id="Asia/Calcutta
	
	Calendar c = Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapur"));
	System.out.println(c.getCalendarType());
	System.out.println(c.getTimeZone().getID());
	System.out.println(c.getTime());
	
	// op gregory
	// GMT
	/*gregory
	GMT
	Wed Nov 15 15:13:13 IST 2023  */
}
}
