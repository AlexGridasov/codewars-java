package com.alex.gri;

import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.*;

/**
 * Created by alex on 02.05.16.
 */
public class FibonacciTest {

    @Test
    public void example1(){
        assertEquals(5, Fibonacci.getFibNumb(193150));
    }

    @Test
    public void example2(){
        assertEquals(0, Fibonacci.getFibNumb(300));
    }

    @Test
    public void example3(){
        assertEquals(6, Fibonacci.getFibNumb(20001));
    }

    @Test
    public void fibonacci(){
        assertEquals(13, Fibonacci.fibonacci(7).intValue());
    }

    @Test
    public void fastFibonacciDoubling(){
        assertEquals(13, Fibonacci.fastFibonacciDoubling(7).intValue());
    }

    @Test
    public void testGetFibNumber() throws Exception {
        assertEquals(0, Fibonacci.getFibNumber(300));
    }
}