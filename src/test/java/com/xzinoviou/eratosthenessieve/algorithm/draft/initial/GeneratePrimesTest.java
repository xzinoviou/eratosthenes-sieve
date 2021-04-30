package com.xzinoviou.eratosthenessieve.algorithm.draft.initial;

import static constant.Constants.PRIMES_UP_TO_100;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GeneratePrimesTest {

  @Test
  public void generatePrimesUpToZero_InitialDraftVersion() {
    System.out.println("PrimeGeneratorTest.generatePrimesUpToZero_InitialDraftVersion");

    int[] nullArray = GeneratePrimes.generatePrimes(0);

    assertEquals(nullArray.length, 0);
  }

  @Test
  public void generatePrimesUpToOne_InitialDraftVersion() {
    System.out.println("PrimeGeneratorTest.generatePrimesUpToOne_InitialDraftVersion");

    int[] minArray = GeneratePrimes.generatePrimes(2);

    assertEquals(minArray.length, 1);
    assertArrayEquals(minArray, new int[] {2});
  }

  @Test
  public void generatePrimesUpToTwo_InitialDraftVersion() {
    System.out.println("PrimeGeneratorTest.generatePrimesUpToTwo_InitialDraftVersion");

    int[] threeArray = GeneratePrimes.generatePrimes(3);

    assertEquals(threeArray.length, 2);
    assertArrayEquals(threeArray, new int[] {2, 3});
  }

  @Test
  public void generatePrimesUpToHundred_InitialDraftVersion() {
    System.out.println("PrimeGeneratorTest.generatePrimesUpToHundred_InitialDraftVersion");

    int[] centArray = GeneratePrimes.generatePrimes(100);

    assertEquals(centArray.length, PRIMES_UP_TO_100.length);
    assertArrayEquals(centArray, PRIMES_UP_TO_100);
  }
}