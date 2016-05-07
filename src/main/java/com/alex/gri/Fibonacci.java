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
        String numStr = String.valueOf(fastFibonacciDoubling(n));
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

    public static int getFibNumber(int n) {
        int n1 = 1;
        int n2 = 1;
        for(int i = 3; i <= n; i++){
            int temp = n1;
            System.out.println("temp " + temp);
            n1 = n2;
            System.out.println("n1 " + n1);
            n2 = (n2 + temp) % 10;
            System.out.println("n2 + temp " + (n2 + temp));
            System.out.println("n2 " + n2);
        }
        return n2;
    }

    /*
     * Fast doubling method. Faster than the matrix method.
     * F(2n) = F(n) * (2*F(n+1) - F(n)).
     * F(2n+1) = F(n+1)^2 + F(n)^2.
     * This implementation is the non-recursive version. See the web page and
     * the other programming language implementations for the recursive version.
     */
    public static BigInteger fastFibonacciDoubling(int n) {
        BigInteger a = BigInteger.ZERO;
        BigInteger b = BigInteger.ONE;
        int m = 0;
        for (int i = 31 - Integer.numberOfLeadingZeros(n); i >= 0; i--) {
            // Loop invariant: a = F(m), b = F(m+1)

            // Double it
            BigInteger d = multiply(a, b.shiftLeft(1).subtract(a));
            BigInteger e = multiply(a, a).add(multiply(b, b));
            a = d;
            b = e;
            m *= 2;

            // Advance by one conditionally
            if (((n >>> i) & 1) != 0) {
                BigInteger c = a.add(b);
                a = b;
                b = c;
                m++;
            }
        }
        return a;
    }

    // Multiplies two BigIntegers. This function makes it easy to swap in a faster algorithm like Karatsuba multiplication.
    private static BigInteger multiply(BigInteger x, BigInteger y) {
        return x.multiply(y);
    }
}
