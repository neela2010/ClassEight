package exercise;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SysDate {

	public static void main(String[] args) {
		// Every time you run the code, want the system date.

		SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
		Date date = new Date();
		
		String StartTime = formatter.format(date);

		// How long does it take to print out 1 to 5000 number.

		for (int i = 1; i <= 300000; i++) {
			System.out.println(i);
		}

		Date date2 = new Date();
		String EndTime = formatter.format(date2); // End Time code must be after for loop

		System.out.println("Start: " + StartTime + " VS " + "EndT: " + EndTime);

		// String RunTime =

		long runTimeDuration = date2.getTime() - date.getTime();
		System.out.println(runTimeDuration / 1000 + " Seconds");
	}

}
