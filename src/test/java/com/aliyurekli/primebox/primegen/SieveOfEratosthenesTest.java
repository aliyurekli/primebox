package com.aliyurekli.primebox.primegen;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

public class SieveOfEratosthenesTest {

    private final Map<Integer, Integer[]> groundTruth = new HashMap<>();

    @Before
    public void setUp() {
        groundTruth.put(0, new Integer[0]);
        groundTruth.put(1, new Integer[0]);

        groundTruth.put(10, new Integer[] {2, 3, 5, 7});
        groundTruth.put(11, new Integer[] {2, 3, 5, 7, 11});

        groundTruth.put(50, new Integer[] {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47});
        groundTruth.put(53, new Integer[] {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53});
    }

    @Test
    public void testPrimeGeneration() {
        SieveOfEratosthenes sieve = new SieveOfEratosthenes();

        for (Integer n: groundTruth.keySet()) {

            Integer[] boxedArray = Arrays.stream(sieve.generate(n))
                    .boxed()
                    .toArray(Integer[]::new);

            Assert.assertArrayEquals(boxedArray, groundTruth.get(n));
        }
    }
}
