package com.aliyurekli.primebox.primegen;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SieveOfEratosthenes implements PrimeGenerator {

    @Override
    public int[] generate(int n) {
        if (n < 2) {
            return new int[0];
        }

        boolean[] primes = new boolean[n+1];
        Arrays.fill(primes, 2, primes.length, true);

        for (int i=2; i<=Math.sqrt(n); i++) {
            if (primes[i]) {
                for (int j=i*i; j<=n; j+=i) {
                    primes[j] = false;
                }
            }
        }

        return IntStream.range(0, primes.length)
                .filter(i -> primes[i])
                .toArray();
    }
}
