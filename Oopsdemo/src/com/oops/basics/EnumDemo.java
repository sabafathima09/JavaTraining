package com.oops.basics;

enum Weekdays{
	MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY
	}
public class EnumDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Weekdays weekday= Weekdays.FRIDAY;
		//covert enum to string
		System.out.println(weekday.name());
		//to get index(oridinal) from enum starts from 0
		Weekdays[] weekdaysArr = weekday.values();
		
		for(Weekdays weekdays: weekdaysArr ){
		System.out.println(weekday.name());
		} 
		System.out.println("convert String to enum constant");
		weekday = Weekdays.valueOf("TUESDAY");
		System.out.println(weekday);

	}

}