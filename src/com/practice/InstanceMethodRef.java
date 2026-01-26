package com.practice;

public class InstanceMethodRef {

	public void m1()  // Instance method
	{
		for(int i=1;i<=5;i++) 
		{
			System.out.print(i+ " ");
			
		}
	}	
	public static void main(String[] args) {
		
		InstanceMethodRef im= new InstanceMethodRef();
//		im.m1();
		Runnable r = im::m1;  // Runnable is Functional Interface having run() which is static method.
		Thread t = new Thread(r);
		t.start();
	}
}
