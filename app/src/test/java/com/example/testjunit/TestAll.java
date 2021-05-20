package com.example.testjunit;

import junit.framework.TestSuite;

public class TestAll extends TestSuite {
    public static TestSuite suite() {
        TestSuite testSuite = new TestSuite("A simple test suite example!");
        testSuite.addTestSuite(TestCalculator.class);
        testSuite.addTestSuite(TestConcatenation.class);
        return testSuite;
    }
}
