package com.aliyurekli.primebox.gcd;

import org.junit.Test;

public class DivisiveEuclideanGcdTest {

    @Test(expected = IllegalArgumentException.class)
    public void testIllegalArgumentException() {
        new DivisiveEuclideanGcd().greatestCommonDivisor(-10, 10);
    }
}
