package com.StreamAPI.java;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class FindName {
	public static void main(String[] args) {
		List<String> l=new ArrayList<>();
		
		l.add("bankong");
		l.add("bangladesh");
		l.add("russia");
		l.add("itly");
		l.add("bangalore");
		l.add("odisha");
		l.add("marathhali");
		
		
		List<String> ans = l.stream().filter(s -> s.startsWith("ban")).collect(Collectors.toList());
		
		System.out.println(ans);
		
	}

}
