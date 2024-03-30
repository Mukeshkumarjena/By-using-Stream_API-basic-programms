package com.StreamAPI.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertListToArray {
	public static void main(String[] args) {
		List<Integer> l=new ArrayList<>();
		
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(40);
		l.add(50);
		
		int[] arr= l.stream().mapToInt(i->i).toArray();
		System.out.println(Arrays.toString(arr));
	}

}
