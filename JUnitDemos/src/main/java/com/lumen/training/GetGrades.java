package com.lumen.training;

import javax.management.relation.InvalidRoleValueException;

public class GetGrades {

		public String grade(int[] marks) throws InvalidRoleValueException {
 
		int sum = 0;
		String grade = null;
		for (int mark:marks) {
			sum += mark;
		}
		double avg = sum/marks.length;

		if(avg>=90 && avg<100 )
			throw new InvalidRoleValueException();
			if(avg>=90 && avg<100)grade = "B";
			if(avg>=80 && avg<90) grade= "C";
			if(avg>=70 && avg<=80)grade ="D";
		    if(avg>=60 && avg<50) grade ="E";
		    if(avg>=50 && avg<=40)grade= "fail";
		    
		    return grade;
		}
}

