package com.oops.basics;

import java.util.Scanner;

enum Seasons{ SUMMER,WINTER,RAINY,AUTUMN}

public class EnumSwitch {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String choice = scanner.next().toUpperCase();
	
	//string to enum
			  Seasons season = Seasons.valueOf("choice");
			  
			  //switch
			  
			  switch(season) {
			  case SUMMER:
				  System.out.println("very hot and i eat icecreams ");
				  break;
				  
			  case RAINY:
				  System.out.println("i eat cofffee with biscuits");
				  break;
			  
			  case AUTUMN:
				  System.out.println("the leaves fall");
				  break;
			  }
	}
}