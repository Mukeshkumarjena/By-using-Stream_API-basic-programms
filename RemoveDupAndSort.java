package com.StreamAPI.java;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDupAndSort {
	public static void main(String[] args) {
		List<Integer> l=new ArrayList<>();
		
		l.add(90);
		l.add(70);
		l.add(40);
		l.add(50);
		l.add(20);
		l.add(30);
		l.add(30);
		l.add(40);
		l.add(60);
		l.add(40);
		l.add(50);
		
		List<Integer> ans=l.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(ans);
	}

}
