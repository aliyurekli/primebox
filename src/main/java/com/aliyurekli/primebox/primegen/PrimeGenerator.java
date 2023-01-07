package com.aliyurekli.primebox.primegen;

import org.apache.commons.lang3.StringUtils;

public interface PrimeGenerator {

    int[] generate(int n);

    default void prettyPrint(int[] primes) {
        int padded = String.valueOf(primes[primes.length-1]).length() + 1;

        for (int i=0; i<primes.length; ) {
            System.out.print(StringUtils.rightPad(String.valueOf(primes[i]), padded));
            if (++i % 10 == 0)
                System.out.print("\n");
        }
    }
}
