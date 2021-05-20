package com.example.testjunit;

import junit.framework.TestCase;

import org.junit.Test;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */

public class TestConcatenation extends TestCase {

    public static class Concatenation {
        public String concatenationOf(String aString1, String aString2) {
            return aString1.concat(aString2);
        }
    }

    @Test
    public void testconcatenation()
    {
        Concatenation c = new Concatenation();
        String string = c.concatenationOf("abc", "def");
        assertEquals("abcdef", string);
    }
}