package com.practice;

import java.util.function.Supplier;

// Supplier(I):
// Predefined interface which will not take any input just return output.


// OPT Generation 
public class SupplierDemo {

	public static void main(String[] args) {
		
		
		Supplier<String> s =( )-> 
		{
			String otp= "";

			
			for(int i=1;i<=5;i++)  // if we want 6 digit otp then run the loop 6 times.
			{
				otp = otp +(int)(Math.random()*10);
			}
			return otp;
		};
		
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get()); // each time will get unique OTP.
	}
}
