package com.lumen.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadLine {
	public static void main(String[] args) {
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader bufferedReader = new BufferedReader(reader);
		String value;
		try {
		value = bufferedReader.readLine();
		System.out.print(value);
		while(!value.equals("stop")) {
			value = bufferedReader.readLine();
		System.out.println(value);
		}
	}catch(IOException e) {
		System.out.println(e.getMessage());
	}
	}


}
