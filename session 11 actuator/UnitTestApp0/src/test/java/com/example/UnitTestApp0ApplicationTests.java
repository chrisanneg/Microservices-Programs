package com.example;

import com.core.JUnitHelloWorld;

import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class UnitTestApp0ApplicationTests {


	@BeforeAll
	public static void beforeClass() {
		System.out.println("Before @BeforeAll");
	}

	@BeforeEach
	public void before() {
		System.out.println("Before Test Case");
	}

	@Test
	public void isGreaterTest() {
		System.out.println("Test");
		JUnitHelloWorld helloWorld = new JUnitHelloWorld();
		assertTrue(helloWorld.isGreater(5, 1), "Num 1 is greater than Num 2");
	}

	@AfterEach
	public void after() {
		System.out.println("After Test Case");
	}

	@AfterAll
	public static void afterClass() {
		System.out.println("After All");
	}

}
