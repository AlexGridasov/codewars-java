package com.alex.gri;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by alex on 02.05.16.
 */
public class SumOfNumbersTest {

    SumOfNumbers s = new SumOfNumbers();

    @Test
    public void test1() {
        assertEquals(-1, s.getSum(0, -1));
        assertEquals(1, s.getSum(0, 1));
    }

    @Test
    public void test2() {
        assertEquals(1, s.getSum(1, 0));
        assertEquals(3, s.getSum(1, 2));
        assertEquals(1, s.getSum(0, 1));
        assertEquals(1, s.getSum(1, 1));
        assertEquals(-1, s.getSum(-1, 0));
        assertEquals(2, s.getSum(-1, 2));
    }

    @Test
    public void testZero() {
        assertEquals(0, s.getSum(0, 0));
    }

    @Test
    public void testEqual() {
        assertEquals(5, s.getSum(5, 5));
    }

    @Test
    public void testSwitchMinMax() {
        assertEquals(3, s.getSum(3, -2));
    }

    @Test
    public void testPositive() {
        assertEquals(15, s.getSum(1, 5));
    }

    @Test
    public void testNegative() {
        assertEquals(-15, s.getSum(-5, -1));
    }
}