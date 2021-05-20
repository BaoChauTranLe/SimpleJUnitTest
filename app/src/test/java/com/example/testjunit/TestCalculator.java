package com.example.testjunit;

import junit.framework.TestCase;

import org.junit.Test;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */

public class TestCalculator extends TestCase {

    public static  class Calculator {
        public double subtract (double n1, double n2) {
            return n1 - n2;
        }

        public double errorSubtract (double n1, double n2) {
            return (float)n1 - (float)n2;
        }
    }

    @Test
    public void testSubtract() {
        Calculator c = new Calculator();
        //Test 1: nominal case
        double r = c.subtract(2.0000000001, 3.0000000002);
        assertEquals(-1.0000000001, r, 0);
        //Test 2: nominal case
        r = c.subtract(Double.MAX_VALUE, Double.MAX_VALUE);
        assertEquals(0.0, r, 0);
    }

    @Test
    public void testErrorSubtract() {
        Calculator c = new Calculator();
        //Test 1: nominal case
        double r = c.errorSubtract(2.0000000001, 3.0000000002);
        assertEquals(-1.0000000001, r, 0);
        //Test 2: nominal case
        r = c.errorSubtract(Double.MAX_VALUE, Double.MAX_VALUE);
        assertEquals(0.0, r, 0);
    }
}