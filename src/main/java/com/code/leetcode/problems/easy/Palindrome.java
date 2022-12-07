package com.code.leetcode.problems.easy;

public class Palindrome {

    public boolean isPalindrome(int num) {
        if (num < 0) {
            return false;
        } else {
            StringBuilder builder = new StringBuilder(String.valueOf(num));
            String numStr = String.valueOf(num);
            String alterStr = builder.reverse().toString();
            if (alterStr.equals(numStr)) {
                return true;
            } else {
                return false;
            }
        }
    }
}
