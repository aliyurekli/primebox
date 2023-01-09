package com.aliyurekli.primebox.gcd;

import org.junit.Test;

public class SubtractiveEuclideanGcdTest {

    @Test(expected = IllegalArgumentException.class)
    public void testIllegalArgumentException() {
        new SubtractiveEuclideanGcd().greatestCommonDivisor(-10, 10);
    }
}
