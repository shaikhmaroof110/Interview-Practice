package com.practice;

interface MyInterface
{
	public void m1();
	
}

public class MyApp implements MyInterface{
	
    public void m1() {
        System.out.println("m1 method called....");
    }
    
    public static void main(String[] args) {
		MyApp ma = new MyApp();
		ma.m1();
	}
}


// Regular OOPs programming
