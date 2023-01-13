package com.aliyurekli.primebox.gcd;

public class SubtractiveEuclideanGcd implements Gcd {

    @Override
    public int greatestCommonDivisor(int a, int b) {
        throwOnCondition(a, b);

        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }

        return a;
    }
}
