package com.lumen.testcases.trial;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.lumen.exception.NegativeValueException;
import com.lumen.training.Student;

class StudentTest {
	Student student;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Before All");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("After All");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Before Each");
		student = new Student();
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("After Each");
		student = null;
	}

	@Test
	 void testTotalMarks() {
		 assertEquals(210,student.totalmarks(50, 70, 90),"should have 100");
	} 
	@Test @DisplayName("testing negative value")
	void testNegTotal(){
		assertThrows(NegativeValueException.class,()->student.totalmarks(-90, 90, 80));
	}
}
	
//	@Test @DisplayName("testing negative value")
//	void testGreaterTotal() {
//		assertThrows(InvalidNumException.class,()->student.totalmarks(90,30,80));


