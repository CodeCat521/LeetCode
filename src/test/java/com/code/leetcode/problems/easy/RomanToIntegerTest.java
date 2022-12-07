package com.code.leetcode.problems.easy;

import junit.framework.TestCase;

public class RomanToIntegerTest extends TestCase {

    public void testRomanToInt() {
        RomanToInteger romanToInteger = new RomanToInteger();
        int m = romanToInteger.romanToInt("MCMXCIV");
        System.out.println(m);
    }
}