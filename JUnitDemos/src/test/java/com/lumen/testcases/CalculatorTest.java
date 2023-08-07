package com.lumen.testcases;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.lumen.training.Calculator;

class CalculatorTest {
	Calculator calculator;
	

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
		calculator =new Calculator();
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("After Each");
		calculator = null;
	}

	@Test @DisplayName("testing sum - positive")
	void testSum() {
		 assertEquals(30.0,30,calculator.sum(10, 20),()->"should be 30.0");// TODO
	}

	@Test @DisplayName("testing product - positive")
	void testProduct() {
		 assertEquals(6, calculator.product(2, 3),"product should be 6");
	}

}
