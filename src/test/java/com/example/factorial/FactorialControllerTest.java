package com.example.factorial;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;

import static org.junit.jupiter.api.Assertions.*;

class FactorialControllerTest {

    @Test
    void fact() {
        var controller = new FactorialController();
        long n=6;
        var result=controller.fact(n);
        var resultStatusCode=result.getStatusCode();
        assertEquals(HttpStatus.OK, resultStatusCode);
    }
    @Test
    void fact1() {
        var controller = new FactorialController();
        long n=0;
        var result=controller.fact(n);
        var resultStatusCode=result.getStatusCode();
        assertEquals(HttpStatus.OK, resultStatusCode);
    }


    @Test
    void facts() {
        var controller = new FactorialController();
        long n=6;
        var result=controller.facts(n);
        var resultStatusCode=result.getStatusCode();
        assertEquals(HttpStatus.OK, resultStatusCode);

    }
    @Test
    void facts1() {
        var controller = new FactorialController();
        long n=1;
        var result=controller.facts(n);
        var resultStatusCode=result.getStatusCode();
        assertEquals(HttpStatus.OK, resultStatusCode);

    }
    @Test
    void facts2() {
        var controller = new FactorialController();
        long n=0;
        var result=controller.facts(n);
        var resultStatusCode=result.getStatusCode();
        assertEquals(HttpStatus.BAD_REQUEST, resultStatusCode);

    }
}



