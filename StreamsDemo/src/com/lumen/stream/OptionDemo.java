package com.lumen.stream;

import java.util.Arrays;
import java.util.Optional;

public class OptionDemo {
public static void main(String[] args) {
	Optional<String> courseOptional = Arrays.asList("Java","Node","Angular","Spring")
	.stream()
	.filter(str->str.length()>10)
	.findFirst();
	//returns the optional
	
	if(courseOptional.isPresent())
		System.out.println(courseOptional.get());
	
	if(!courseOptional.isEmpty())
		System.out.println(courseOptional.get());
	
	courseOptional.ifPresent(System.out::println);
	
	String cname=Arrays.asList("java","Node","Angular","Spring")
			.stream()
			.filter(str->str.length()>1)
			.findFirst()
//			.get()//if no value throws exception
			.orElse("No Courses");//if value present return it or return the value in orElse
	         System.out.println(cname);
	         
	         String ccname=Arrays.asList("Java","Node","Angular","Spring")
	     			.stream()
	     			.filter(str->str.length()>10)
	     			.findFirst()
//	     			.get()//if no value throws exception
	     			.orElseGet(()->"hello");//if value present return it or return the value in orElse
	     	System.out.println(ccname);
	     	
	     	
	     	String coname=Arrays.asList("Java","Node","Angular","Spring")
	     			.stream()
	     			.filter(str->str.length()>10)
	     			.findFirst()
//	     			.get()//if no value throws exception
	     			.orElseThrow(()->new RuntimeException("no value present"));
	     	        System.out.println(coname);
	}
}