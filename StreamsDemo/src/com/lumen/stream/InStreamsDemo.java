package com.lumen.stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class InStreamsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> Courses=Arrays.asList("Java","Angular","Angular","Node","Spring","CSS","React");
		//convert to a stream
		
		Iterator<String> iterator = Courses.stream()
				.filter(str->str.length()>4)
                 .skip(2)
                 .iterator(); //terminal
		while (iterator.hasNext()) {
			String cname = (String) iterator.next();
			System.out.println(cname);
		}
		System.out.println();
		Courses.stream()
		       .filter(str->str.length()>4)
		       .distinct()
		       .limit(2)
		       .forEach(str->  System.out.println(str.toUpperCase()));
		
		System.out.println();
		List<Integer>ncourses = Courses.stream()
				.sorted()
				.map(str->str.length())//i/p is string and o/p is int
				.filter(num->num>5)
				.collect(Collectors.toList());//convert to list
		ncourses.forEach(num->System.out.println(num));
	
		List<Integer>newcourses = Courses.stream()
		.sorted()
		.map(str->str.length())
		.filter(num ->(num%2 == 0))
		.collect(Collectors.toList());
		newcourses.forEach(num->System.out.println(num));
	}
}




