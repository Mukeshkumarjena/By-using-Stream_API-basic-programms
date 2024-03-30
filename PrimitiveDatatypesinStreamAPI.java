package com.StreamAPI.java;

import java.util.Arrays;
import java.util.stream.IntStream;

// add two arrays and remove duplicates and sorted the array using streamAPI

public class PrimitiveDatatypesinStreamAPI {
	public static void main(String[] args) {
		
		int[] a1={10,20,30,40,40};
		int[] a2={1,2,3,4,5,6,7,8,80,50,60};
		
		IntStream i1=IntStream.of(a1);
		IntStream i2=IntStream.of(a2);
		int[] ans=IntStream.concat(i1, i2).distinct().sorted().toArray();
		
		System.out.println(Arrays.toString(ans));
	}

}
