package com.StreamAPI.java;

import java.util.List;
import java.util.ArrayList;

public class Demo1 {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		
		//list.forEach(System.out::println);
		list.forEach(i->System.out.print(i+ " "));
		
	}
}
