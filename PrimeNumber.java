package com.StreamAPI.java;

import java.util.stream.IntStream;

public class PrimeNumber {
	public static void main(String[] args) {
		int num=69;
		
		String ans=IntStream.range(1,num+1).filter(i->(num%i==0)).count()==2 ? "prime number" : "not prime";
		System.out.println(ans);
	}

}
