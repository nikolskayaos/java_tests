package ru.sandbox.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.sandbox.Primes;

public class PrimesTests {

    @Test
    public void testPrime(){
        Assert.assertTrue(Primes.isPrime(Integer.MAX_VALUE));
    }

    @Test
    public void testNotPrime(){
        Assert.assertFalse(Primes.isPrime(Integer.MAX_VALUE - 2));
    }

    @Test
    public void testLongPrime(){
        long m = Integer.MAX_VALUE;
        Assert.assertTrue(Primes.isPrimeLong(m));
    }

    @Test
    public void testWhilePrime(){
        Assert.assertTrue(Primes.isPrimeWhile(Integer.MAX_VALUE));
    }
}
