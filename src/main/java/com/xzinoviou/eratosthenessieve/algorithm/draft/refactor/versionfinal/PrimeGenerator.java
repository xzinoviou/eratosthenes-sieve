package com.xzinoviou.eratosthenessieve.algorithm.draft.refactor.versionfinal;

/**
 * Robert Martin's Refactoring.
 * Agile Software Development.
 * Eratosthenes' Sieve.
 * #Refactored - Final Version 7.
 */
public class PrimeGenerator {
  private static boolean[] crossedOut;
  private static int[] result;

  public static int[] generatePrimes(int maxValue) {
    if (maxValue < 2) {
      return new int[0];
    } else {
      uncrossIntegersUpTo(maxValue);
      crossOutMultiples();
      putUncrossedIntegersIntoResult();
      return result;
    }
  }

  private static void uncrossIntegersUpTo(int maxValue) {
    crossedOut = new boolean[maxValue + 1];

    for (int i = 2; i < crossedOut.length; i++) {
      crossedOut[i] = false;
    }
  }

  private static void crossOutMultiples() {
    int limit = determineIterationLimit();
    for (int i = 2; i <= limit; i++) {
      if (notCrossed(i)) {
        crossOutMultiplesOf(i);
      }
    }

  }

  private static int determineIterationLimit() {
    double maxPrimeFactor = Math.sqrt(crossedOut.length);
    return (int) maxPrimeFactor;
  }

  private static void crossOutMultiplesOf(int i) {
    for (int multiple = 2 * i;
         multiple < crossedOut.length;
         multiple += i) {
      crossedOut[multiple] = true;
    }
  }

  private static boolean notCrossed(int i) {
    return crossedOut[i] == false;
  }

  private static void putUncrossedIntegersIntoResult() {
    result = new int[numberOfUncrossedIntegers()];

    for (int i = 2, j = 0; i < crossedOut.length; i++) {
      if (!crossedOut[i]) {
        result[j++] = i;
      }
    }
  }

  private static int numberOfUncrossedIntegers() {
    int count = 0;

    for (int i = 2; i < crossedOut.length; i++) {
      if (notCrossed(i)) {
        count++;
      }
    }

    return count;
  }
}
