package com.aliyurekli.primebox.gcd;

public class BinaryGcd implements Gcd {

    public  int greatestCommonDivisor(int a, int b) {
        throwOnCondition(a, b);

        if (a == 0) return b;
        if (b == 0) return a;

        int shift = 0;
        while (((a | b) & 1) == 0) {
            a >>= 1;
            b >>= 1;
            shift ++;
        }

        while ((a & 1) == 0) {
            a >>= 1;
        }

        while (b != 0) {
            while ((b & 1) == 0) {
                b >>= 1;
            }
            if (a > b) {
                int temp = a;
                a = b;
                b = temp;
            }
            b -= a;
        }

        return a << shift;
    }
}
