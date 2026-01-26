package com.practice;

@FunctionalInterface
interface MyInter
{
	public void m1();
}

public class MethodReference {
	public static void m2() 
	{
		System.out.println("This is a m2 method....");
	}
	
	public static void main(String[] args) {
		MyInter mi = MethodReference::m2;  // static method reference.
//		MyInter mo = () -> System.out.println("Hi This is lamda expression..");
		mi.m1();
//		mo.m1();
	}
}
