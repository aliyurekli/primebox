package com.aliyurekli.primebox.gcd;

public class DivisiveEuclideanGcd implements Gcd {

    @Override
    public int greatestCommonDivisor(int a, int b) throws IllegalArgumentException {
        if (a < 0 || b < 0)
            throw new IllegalArgumentException("Non-negative inputs are expected.");

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }
}
