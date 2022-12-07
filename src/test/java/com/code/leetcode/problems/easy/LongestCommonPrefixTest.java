package com.code.leetcode.problems.easy;

import junit.framework.TestCase;

public class LongestCommonPrefixTest extends TestCase {

    public void testLongestCommonPrefix() {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        String commonPrefix = longestCommonPrefix.longestCommonPrefix(new String[]{"flower", "flow", "flight"});
        System.out.println("commonPrefix = " + commonPrefix);
    }
}