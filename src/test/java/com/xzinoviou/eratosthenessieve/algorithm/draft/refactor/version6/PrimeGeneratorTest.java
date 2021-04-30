package com.xzinoviou.eratosthenessieve.algorithm.draft.refactor.version6;

import static constant.Constants.PRIMES_UP_TO_100;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PrimeGeneratorTest {

  @Test
  public void generatePrimesUpToZero_RefactoredVersion6() {
    System.out.println("PrimeGeneratorTest.generatePrimesUpToZero_RefactoredVersion6");

    int[] nullArray = PrimeGenerator.generatePrimes(0);

    assertEquals(nullArray.length, 0);
  }

  @Test
  public void generatePrimesUpToOne_RefactoredVersion6() {
    System.out.println("PrimeGeneratorTest.generatePrimesUpToOne_RefactoredVersion6");

    int[] minArray = PrimeGenerator.generatePrimes(2);

    assertEquals(minArray.length, 1);
    assertArrayEquals(minArray, new int[] {2});
  }

  @Test
  public void generatePrimesUpToTwo_RefactoredVersion6() {
    System.out.println("PrimeGeneratorTest.generatePrimesUpToTwo_RefactoredVersion6");

    int[] threeArray = PrimeGenerator.generatePrimes(3);

    assertEquals(threeArray.length, 2);
    assertArrayEquals(threeArray, new int[] {2, 3});
  }

  @Test
  public void generatePrimesUpToHundred_RefactoredVersion6() {
    System.out.println("PrimeGeneratorTest.generatePrimesUpToHundred_RefactoredVersion6");

    int[] centArray = PrimeGenerator.generatePrimes(100);

    assertEquals(centArray.length, PRIMES_UP_TO_100.length);
    assertArrayEquals(centArray, PRIMES_UP_TO_100);
  }

}