package datetimeapi;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;

public class DateTimeAPI {
	
	public static void main(String[] args) {
		
		LocalDate d1 = LocalDate.now();
		System.out.println(d1);
		
		LocalDate d2 = LocalDate.of(2019, 01, 01);
		System.out.println(d2);
		
		// An issue can arise when you use number.
		LocalDate d3 = LocalDate.of(2019, Month.APRIL, 01);
		System.out.println(d3);
		
		
		//--------------------------------------------------------------
		
		
		LocalTime t1 = LocalTime.now();
		System.out.println(t1);
		
		LocalTime t2 = LocalTime.of(2, 23, 54, 9321);
		System.out.println(t2);

		LocalTime t3 = LocalTime.now(ZoneId.of("Asia/Kuwait"));
		System.out.println(t3);
		
		//---------------------------------------------------------------
		
		Instant I1 = Instant.now();
		System.out.println(I1);
		
		
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);
		
		
	}

}
