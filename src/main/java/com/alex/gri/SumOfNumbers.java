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
        int first;
        int last;
        int sum = 0;

        if (a < b) {
            first = a;
            last = b;
        } else {
            first = b;
            last = a;
        }

        /*for (int i = first; i <= last; i++) {
            sum += i;
        }*/

        sum = IntStream
                .range(first, last + 1)
                .sum();

        return sum;
    }
}
