package com.aliyurekli.primebox.primality;

import java.util.Random;

public class FermatPrimality implements PrimeChecker {

    private int iterations;

    private final Random random = new Random();

    public FermatPrimality(int iterations) {
        this.iterations = iterations;
    }

    public void setIterations(int iterations) {
        this.iterations = iterations;
    }

    private long modularExponentiation(long x, long e, long m) {
        long result = 1;

        while (e > 0) {
            if (e % 2 != 0) {
                result = (result * x) % m;
                e --;
            }
            else {
                x = (x * x) % m;
                e = e / 2;
            }
        }

        return result;
    }

    @Override
    public boolean isPrime(int n) {
        if (n <= 3)
            return n >= 2;

        if (n % 2 == 0)
            return false;

        for (int i=1; i<=iterations; i++) {
            long a = random.nextLong(2, n);
            if (modularExponentiation(a, n-1, n) != 1)
                return false;
        }

        return true;
    }
}
