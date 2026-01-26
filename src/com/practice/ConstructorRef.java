package com.practice;

import java.util.function.Supplier;

public class ConstructorRef {

	public static void main(String[] args) {
		
//		Doctor d = new Doctor();
		
		Supplier<Doctor> s = Doctor::new;
		System.out.println(s.get().hashCode());
		// Its not allowed for parameterized constructor...
	}
}


class Doctor
{
	public Doctor() 
	{
		System.out.println("Doctor Constructor....");
	}
}


