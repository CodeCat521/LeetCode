package com.code.leetcode.problems.easy;


import org.junit.Test;

import java.util.Arrays;

public class TwoSumTest {

    @Test
    public void testTwoSum() {
        TwoSum twoSum = new TwoSum();

        int[] arr = {6,7,10,11,14};
        int target = 16;
        int[] index = twoSum.twoSum1(arr, target);

        System.out.println("目标数组值：" + Arrays.toString(arr));
        System.out.println("两数相加目标值：" + target);
        System.out.println("查找数组索引：" + Arrays.toString(index));
    }



}
