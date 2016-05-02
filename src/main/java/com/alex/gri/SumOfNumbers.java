package com.alex.gri;

import java.util.stream.IntStream;

/**
 * Created by alex on 02.05.16.
 *
 * Given two integers, which can be positive and negative, find the sum of all the numbers between including them too and return it. If both numbers are equal return a or b.

 * Note! a and b are not ordered!
 *
 * Example:
 * GetSum(1, 0) == 1   // 1 + 0 = 1
 * GetSum(1, 2) == 3   // 1 + 2 = 3
 * GetSum(0, 1) == 1   // 0 + 1 = 1
 * GetSum(1, 1) == 1   // 1 Since both are same
 * GetSum(-1, 0) == -1 // -1 + 0 = -1
 * GetSum(-1, 2) == 2  // -1 + 0 + 1 + 2 = 2
 */
public class SumOfNumbers {

    public int getSum(int a, int b) {
        int sum = IntStream
                .range(Math.min(a, b), Math.max(a, b) + 1)
                .sum();

        return sum;
    }
}
