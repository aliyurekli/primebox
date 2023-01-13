package com.aliyurekli.primebox.gcd;

public class DivisiveEuclideanGcd implements Gcd {

    @Override
    public int greatestCommonDivisor(int a, int b) {
        throwOnCondition(a, b);

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }
}
