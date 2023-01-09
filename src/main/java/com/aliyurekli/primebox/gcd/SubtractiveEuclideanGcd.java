package com.aliyurekli.primebox.gcd;

public class SubtractiveEuclideanGcd implements Gcd {

    @Override
    public int greatestCommonDivisor(int a, int b) throws IllegalArgumentException {
        if (a < 0 || b < 0)
            throw new IllegalArgumentException("Non-negative inputs are expected.");

        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }

        return a;
    }
}
