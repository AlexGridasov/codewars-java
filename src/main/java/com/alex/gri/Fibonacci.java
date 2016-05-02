package com.alex.gri;

import java.math.BigInteger;

/**
 * Created by alex on 02.05.16.
 * Takes the index as an argument and returns last digit from fibonacci number.
 * Example: getLastDigit(15) - 610. Your method must return 0 because the last digit of 610 is 0. Fibonacci sequence grows very fast and value can take very big numbers.
 */
public class Fibonacci {

    /**
     * Takes the index as an argument and returns last digit from fibonacci number.
     * @param n index in Fibonacci sequence 1, 1, 2, 3, 5, 8, 13...
     * @return last digit from fibonacci number
     */
    public static int getFibNumb(int n) {
        String numStr = String.valueOf(fibonacci(n));
        return Integer.parseInt(numStr.substring(numStr.length() - 1));
    }


    /**
     * Find n-th fibonacci number.
     * @param n index in Fibonacci sequence
     * @return fibonacci number
     */
    public static BigInteger fibonacci(int n) {
        if (n <= 1)
            return BigInteger.valueOf(n);

        BigInteger fibNMinus1 = BigInteger.valueOf(1);
        BigInteger fibNMinus2 = BigInteger.valueOf(0);
        BigInteger fib = BigInteger.valueOf(0);

        for (long i = 2L; i <= n; i++) {
            fib = fibNMinus1.add(fibNMinus2);
            fibNMinus2 = fibNMinus1;
            fibNMinus1 = fib;
        }
        return fib;
    }
}
