package com.StreamAPI.java;

import java.util.stream.IntStream;

public class PerfectNumber {
	public static void main(String[] args) {
		int num=6;
		 String sum = (IntStream.range(1, num).filter(i -> num % i == 0).sum()==num) ?"perfect": "not perfect";	
		 System.out.println(sum);
	                
	}
}

//load and regster the driver
//establish the connection
//create st
//execute st
//processing the resultset
//close the connection
//dependency is a link for JAR file
