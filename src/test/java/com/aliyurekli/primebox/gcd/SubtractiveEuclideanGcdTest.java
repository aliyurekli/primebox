package com.aliyurekli.primebox.gcd;

import org.junit.Assert;
import org.junit.Test;

public class SubtractiveEuclideanGcdTest {

    @Test
    public void testGcd() {
        Gcd euclidean = new SubtractiveEuclideanGcd();
        int[][] tests = GcdGroundTruth.getGroundTruth();

        for (int[] test: tests) {
            int num1 = test[0];
            int num2 = test[1];
            int expected = test[2];

            Assert.assertEquals(euclidean.greatestCommonDivisor(num1, num2), expected);
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIllegalArgumentException() {
        new SubtractiveEuclideanGcd().greatestCommonDivisor(-10, 10);
    }
}
