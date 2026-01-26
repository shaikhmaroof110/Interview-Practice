package com.practice;


//WAJP to Print number 1-5 using Thread with the help of runnable interface.
//
//// Approach - 1
//public class ThreadDemo implements Runnable{
//	
//	@Override
//	public void run() 
//	{
//		for(int i=1;i<=5;i++) 
//		{
//			System.out.print(i+ " ");
//			
//		}
//		
//	}
//
//	public static void main(String[] args) {
//		ThreadDemo td= new ThreadDemo();
//		
//		Thread t = new Thread(td);
//		t.start();
//	}
//}

//Approach - 2
//
//public class ThreadDemo{
//	public static void main(String[] args) {
//		Runnable r = new Runnable() 
//		{
//			@Override
//			public void run() 
//			{
//				for(int i=1;i<=5;i++) 
//				{
//					System.out.print(i+ " ");	
//				}		
//			}
//		};
//		Thread t = new Thread(r);
//		t.start();	
//	}
//}



//Approach - 3

public class ThreadDemo{
	public static void main(String[] args) {
		
	Runnable r = () ->  // lamda expression with functional interface Runnable(I) 
	{
		for(int i=1;i<=5;i++) 
			{
				System.out.print(i+ " ");	
			}	
	};
	
	Thread t = new Thread(r);
	t.start();
	}
}



