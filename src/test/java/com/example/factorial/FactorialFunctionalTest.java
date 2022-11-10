package com.example.factorial;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FactorialFunctionalTest {

    long n;
    long expected;
    long actual;

    ArrayList<Long> expectedlist;
    ArrayList<Long> actuallist;


    @Test
    void test1(){
        n=0;
        expected=1;
        actual= factorialfunctional.Fact(n);
        assertEquals(expected, actual);
    }
    @Test
    void test2(){
        n=1;
        expected=1;
        actual=factorialfunctional.Fact(n);
        assertEquals(expected, actual);
    }
    @Test
    void test3() {
        n=6;
        expected=720;
        actual=factorialfunctional.Fact(n);
        assertEquals(expected, actual);
    }
    @Test
    void test4()
    {
        n=3;
        expectedlist = new ArrayList<>(Arrays.asList(1L,2L,6L));
        actuallist=factorialfunctional.FactsTillN(n);
        assertEquals(expectedlist, actuallist);
    }
    @Test
    void test5()
    {
        n=1;
        expectedlist = new ArrayList<>(List.of(1L));
        actuallist=factorialfunctional.FactsTillN(n);
        assertEquals(expectedlist, actuallist);
    }
    @Test
    void test6()
    {
        n=6;
        expectedlist = new ArrayList<>(Arrays.asList(1L,2L,6L, 24L, 120L, 720L));
        actuallist=factorialfunctional.FactsTillN(n);
        assertEquals(expectedlist, actuallist);
    }
}