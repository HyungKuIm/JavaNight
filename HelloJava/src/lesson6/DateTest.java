package lesson6;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		// 현재시간 타입
		Date date = new Date();
		System.out.println(date);

		SimpleDateFormat sdf = new SimpleDateFormat
				("yyyy/MM/dd(E)");
		System.out.println(sdf.format(date));

		// 캘린더타입
		Calendar cal = Calendar.getInstance();
		cal.set(2020, 0, 1);  // 2020/01/01
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH) + 1);
		System.out.println(cal.get(Calendar.DATE));
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));


		// 로컬데이트타임타입
		LocalDate date2 = LocalDate.now();
		System.out.println(date2);
		
		// 2020-01-01
		LocalDate date3 = LocalDate.of(2020, 1, 1);
		

	}

}
