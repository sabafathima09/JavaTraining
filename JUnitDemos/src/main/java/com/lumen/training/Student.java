package com.lumen.training;

import com.lumen.exception.NegativeValueException;

public class Student {
	public int totalmarks(int mark1, int mark2, int mark3) {
		if (mark1 < 0 || mark2 < 0 || mark3 < 0)
			throw new NegativeValueException();

		return mark1 + mark2 + mark3;

	}
}
