package com.example.factorial;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class FactorialApplicationTests {
	long n;
	long expected;
	long actual;

	ArrayList<Long> expectedlist;
	ArrayList<Long> actuallist;


	@Test
	void test1(){
		n=0;
		expected=1;
		actual=FactorialController.fact(n);
		assertEquals(expected, actual);
	}
	@Test
	void test2(){
		n=1;
		expected=1;
		actual=FactorialController.fact(n);
		assertEquals(expected, actual);
	}
	@Test
	void test3() {
		n=6;
		expected=720;
		actual=FactorialController.fact(n);
		assertEquals(expected, actual);
	}
	@Test
	void test4()
	{
		n=3;
		expectedlist = new ArrayList<>(Arrays.asList(1L,2L,6L));
		actuallist=FactorialController.facts(n);
		assertEquals(expectedlist, actuallist);
	}
	@Test
	void test5()
	{
		n=1;
		expectedlist = new ArrayList<>(List.of(1L));
		actuallist=FactorialController.facts(n);
		assertEquals(expectedlist, actuallist);
	}
	@Test
	void test6()
	{
		n=6;
		expectedlist = new ArrayList<>(Arrays.asList(1L,2L,6L, 24L, 120L, 720L));
		actuallist=FactorialController.facts(n);
		assertEquals(expectedlist, actuallist);
	}
}
