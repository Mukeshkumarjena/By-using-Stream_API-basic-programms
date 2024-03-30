package com.StreamAPI.java;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Demo2 {
	public static void main(String[] args) {
		List<Integer> l=new ArrayList<>();
		
		l.add(20);
		l.add(30);
		l.add(30);
		l.add(40);
		l.add(40);
		l.add(40);
		l.add(50);
		
		//System.out.println(l.size());
		//long an=l.stream().count();
		//long an1=l.stream().count();
		
		//List<Integer> ans=l.stream().filter(i->(i%8==0)).collect(Collectors.toList());
		List<Integer> an2=l.stream().distinct().collect(Collectors.toList());
		
		System.out.println(an2);
	}
}
