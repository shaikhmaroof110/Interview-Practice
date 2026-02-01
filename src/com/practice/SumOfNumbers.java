package com.practice;

import java.util.Arrays;

public class SumOfNumbers {
	public static void main(String[] args) {
		
		int []nums = {1,3,2,5,4};
		
		int sum=0;
		
//		for(int i: nums) 
//		{
//			
//			sum = sum+i;
//		}
//		System.out.println(sum);
		
		int reduce = Arrays.stream(nums).reduce(0, (a,b) ->(a+b));
		System.out.println(reduce);
	}

}




// Stream reduce .