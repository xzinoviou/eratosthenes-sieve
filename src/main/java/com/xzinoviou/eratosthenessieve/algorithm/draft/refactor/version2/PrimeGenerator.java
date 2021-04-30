package com.xzinoviou.eratosthenessieve.algorithm.draft.refactor.version2;

/**
 * Robert Martin's Refactoring.
 * Agile Software Development.
 * Eratosthenes' Sieve.
 * #Refactored - Version 2.
 */
public class PrimeGenerator {

  private static int s;
  private static boolean[] f;
  private static int[] primes;

  public static int[] generatePrimes(int maxValue) {
      if (maxValue < 2) {
          return new int[0];
      } else {
          initializeSieve(maxValue);
          sieve();
          loadPrimes();
          return primes;
      }
  }

  private static void loadPrimes() {
    int i;
    int j;
    //how many primes are there?
    int count = 0;
    for (i = 0; i < s; i++) {
        if (f[i]) {
            count++; //bump count
        }
    }

    primes = new int[count];

    //move the primes into the result
    for (i = 0, j = 0; i < s; i++) {
        if (f[i]) //if prime
        {
            primes[j++] = i;
        }
    }
  }

  private static void sieve() {
    int i;
    int j;
    for (i = 2; i < Math.sqrt(s) + 1; i++) {
      if (f[i]) //if i is uncrossed, cross its multiples
      {
          for (j = 2 * i; j < s; j += i) {
              f[j] = false; //multiple is not prime
          }
      }
    }
  }

  private static void initializeSieve(int maxValue) {
    s = maxValue + 1;
    f = new boolean[s];
    int i;

      for (i = 0; i < s; i++) {
          f[i] = true;
      }

    f[0] = f[1] = false;
  }

  private PrimeGenerator(){}
}
