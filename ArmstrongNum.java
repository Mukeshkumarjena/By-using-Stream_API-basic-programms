package com.StreamAPI.java;

import java.util.Arrays;


public class ArmstrongNum {
	public static void main(String[] args) {
		int num=1634;
		int numDigits = String.valueOf(num).length();

	    String an=(Arrays.stream(String.valueOf(num).chars().map(c -> (int) Math.pow(Character.getNumericValue(c), numDigits)).toArray())
	                .sum() == num) ?"armstrong number":"not armastrong number";
	    System.out.println(an);
	}

}

