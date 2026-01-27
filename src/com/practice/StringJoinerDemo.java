package com.practice;

import java.util.StringJoiner;

public class StringJoinerDemo {

	public static void main(String[] args) {
		StringJoiner sj1 = new StringJoiner("-"); 
		sj1.add("Shaikh");
		sj1.add("Mohammed");
		sj1.add("Maroof");
		
		System.out.println(sj1); //output ::  Shaikh-Mohammed-Maroof
		
		StringJoiner sj2 = new StringJoiner("-","(",")"); // Prefix = ( , Suffix = )
		
		sj2.add("Backend");
		sj2.add("Developer");
		sj2.add("Microsoft");
		
		System.out.println(sj2); //output :: (Backend-Developer-Microsoft)
		
		
	}
}


//==========why java 8 introduce string joiner, if string is immutable===
