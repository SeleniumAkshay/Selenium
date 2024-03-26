package Selenium;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class DateEx {
	
	public static void main(String[] args) {
		
		Date date=new Date();
		System.out.println(date);
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy:MM:dd");
		String result = sdf.format(date);
		
		System.out.println(result.replace(":",""));
		
		Calendar cal = sdf.getCalendar();
		cal.add(Calendar.DAY_OF_MONTH, 3);
		String result1 = sdf.format(cal.getTime());
		System.out.println(result1);
		
		String time = LocalDate.now().toString().replace("-","");
		System.out.println(time);
		
		String time1 = LocalDateTime.now().toString().replace("-","").replace(":","").replace(".","");
		System.out.println(time1);
	}

}
