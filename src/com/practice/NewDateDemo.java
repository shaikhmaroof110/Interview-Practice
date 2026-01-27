package com.practice;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.util.Date;

public class NewDateDemo {

	public static void main(String[] args) {
//		Date d= new Date();
//		System.out.println(d);
//		
//		
//		LocalDate d2= LocalDate.now();
//		System.out.println(d2);
//		LocalDate date = d2.plusDays(7);
//		System.out.println(date);
//		
//		LocalDate plusMonths = d2.plusMonths(1);
//		System.out.println(plusMonths);
//		
//		
//		boolean leapYear = LocalDate.parse("2026-12-22").isLeapYear();
//		System.out.println(leapYear);
//		
//		
//		boolean before = LocalDate.parse("2026-01-26").isBefore(LocalDate.parse("2027-02-24"));
//		System.out.println(before);
		
//		LocalTime t= LocalTime.now();
//		System.out.println(t);
//		
//		Period between = Period.between(LocalDate.parse("1998-07-27"), LocalDate.now());
//		System.out.println(between);
//		
//		
//		Duration duration = Duration.between(LocalTime.parse("06:00"), LocalTime.now());
//		System.out.println(duration);
		
		
		LocalDate of = LocalDate.of(2023, 01,25);
		System.out.println(of);
		
	}
}

