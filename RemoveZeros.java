package com.StreamAPI.java;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveZeros {
	public static void main(String[] args) {
		List<Integer> l=new ArrayList<>();
		
		l.add(20);
		l.add(0);
		l.add(30);
		l.add(00);
		l.add(40);
		l.add(0);
		l.add(30);
		
		List<Integer> arr=l.stream().filter(i->i!=0).sorted().collect(Collectors.toList());
		System.out.println(arr);
		
	}

}
