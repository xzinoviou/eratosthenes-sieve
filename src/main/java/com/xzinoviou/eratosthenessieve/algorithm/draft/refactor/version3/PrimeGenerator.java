package com.xzinoviou.eratosthenessieve.algorithm.draft.refactor.version3;

/**
 * Robert Martin's Refactoring.
 * Agile Software Development.
 * Eratosthenes' Sieve.
 * #Refactored - Version 3.
 */
public class PrimeGenerator {

  private static boolean[] f;
  private static int[] result;

  public static int[] generatePrimes(int maxValue) {
      if (maxValue < 2) {
          return new int[0];
      } else {
          initializeArrayOfIntegers(maxValue);
          crossOutMultiples();
          putUncrossedIntegersIntoResult();
          return result;
      }
  }

  private static void putUncrossedIntegersIntoResult() {

    //how many primes are there?
    int count = 0;
    for (int i = 0; i < f.length; i++) {
        if (f[i]) {
            count++; //bump count
        }
    }

    result = new int[count];

    //move the primes into the result
    for (int i = 0, j = 0; i < f.length; i++) {
        if (f[i]) //if prime
        {
            result[j++] = i;
        }
    }
  }

  private static void crossOutMultiples() {
    for (int i = 2; i < Math.sqrt(f.length) + 1; i++) {
      if (f[i]) //if i is uncrossed, cross its multiples
      {
          for (int j = 2 * i; j < f.length; j += i) {
              f[j] = false; //multiple is not prime
          }
      }
    }
  }

  private static void initializeArrayOfIntegers(int maxValue) {
    f = new boolean[maxValue + 1];
    f[0] = f[1] = false; //neither primes nor multiples.

    for (int i = 2; i < f.length; i++)
      f[i] = true;

  }
}