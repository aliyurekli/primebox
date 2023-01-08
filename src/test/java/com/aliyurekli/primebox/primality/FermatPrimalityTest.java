package com.aliyurekli.primebox.primality;

import org.junit.Assert;
import org.junit.Test;

public class FermatPrimalityTest {

    @Test
    public void testIsPrime() {
        FermatPrimality fermat = new FermatPrimality(3);

        Assert.assertFalse(fermat.isPrime(0));
        Assert.assertFalse(fermat.isPrime(1));
        Assert.assertFalse(fermat.isPrime(34));
        Assert.assertFalse(fermat.isPrime(35));
        Assert.assertFalse(fermat.isPrime(Integer.MAX_VALUE - 1));

        Assert.assertTrue(fermat.isPrime(2));
        Assert.assertTrue(fermat.isPrime(3));
        Assert.assertTrue(fermat.isPrime(11));
        Assert.assertTrue(fermat.isPrime(19));
        Assert.assertTrue(fermat.isPrime(Integer.MAX_VALUE));
    }
}
