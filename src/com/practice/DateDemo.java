package com.practice;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args)  throws Exception{
		Date d = new Date();
//		System.out.println(d); // output ::  Mon Jan 26 23:08:53 IST 2026
		
		// Requirement dd/mm/yy
		// Converting Date to String
		SimpleDateFormat sdf = new SimpleDateFormat("DD/MM/YY");
		String format = sdf.format(d);
//		System.out.println(format);
		
		
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("MM/DD/YY"); // MM = number , MMM= Jan , MMMM = January // YY = 26, YYYY = 2026                                                  
		String format1 = sdf1.format(d);
//		System.out.println(format1);
		
		// Convert String to Date
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-mm-dd");
		Date parseDate = sdf2.parse("2026-01-26");
		System.out.println(parseDate);
		
		
	}
}
