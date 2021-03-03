package date_time;

import java.text.DateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

public class Current_date_time {

	public Current_date_time() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		 LocalDateTime now = LocalDateTime.now();  
		   System.out.println(dtf.format(now));  
		
		System.out.println((java.time.LocalDate.now()));
	}

}
