package com.aliyurekli.primebox.gcd;

public interface Gcd {

    int greatestCommonDivisor(int a, int b);

    default void throwOnCondition(int a, int b) {
        if (a < 0 || b < 0)
            throw new IllegalArgumentException("Non-negative inputs are expected.");
    }
}
