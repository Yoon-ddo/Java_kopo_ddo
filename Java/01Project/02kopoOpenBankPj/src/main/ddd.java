package main;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ddd {

	public static void main(String[] args) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yy/MM/dd");
		Date date = new Date();
		String today = dateFormat.format(date);
		String edate = "20/04/15";
		
		int compare = today.compareTo(edate);
		
		System.out.println(compare);
		
		
		System.out.println(today.codePointBefore(compare));
		System.out.println(today);
		
		

	}

}
