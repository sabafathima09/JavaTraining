package com.lumen.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlatDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names ={"Saba","Fathima","noorain","Samreen"};
		Arrays.stream(names).forEach(System.out::println);		
		
		String[][] twoCourses =new String[][] {{"CSS","HTML"},{"SQL","Node"},{"Java","Angular"}};
		Stream<String[]> streamTwo = Arrays.stream(twoCourses);
		
		//call flatmap to convert Stream<String[]> to
		Stream<String>streamo = streamTwo.flatMap(onearr->Arrays.stream(onearr));
		
	//apply map if you want to chnage the data
		
	streamo.mapToInt(String::length).forEach(System.out::println);
	
	Arrays.stream(twoCourses) //Streamstring[]
	.flatMap(onearr->Arrays.stream(onearr))
	.map(String::toUpperCase)
	.forEach(System.out::println);
	}
}
