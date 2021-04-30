package com.xzinoviou.eratosthenessieve.algorithm;

import com.xzinoviou.eratosthenessieve.algorithm.draft.initial.GeneratePrimes;
import java.util.Arrays;

public class TestGeneratePrimes {

  private static int[] testNumbers = new int[] {0, 2, 3, 100};
  private static int[] result = null;

  public static void main(String[] args) {
    initialDraftVersion1();
    refactorVersion2();
    refactorVersion3();
    refactorVersion4();
    refactorVersion5();

  }

  public static void print(int[] primes) {
    System.out.println("n = " + primes.length + " : " + Arrays.toString(primes));


  }

  public static void initialDraftVersion1() {
    System.out.println("Initial Draft");
    for (int i : testNumbers) {
      result = GeneratePrimes.generatePrimes(i);
      print(result);
    }
    System.out.println();
  }

  public static void refactorVersion2() {
    System.out.println("Refactor Version 2");
    for (int i : testNumbers) {
      result = com.xzinoviou.eratosthenessieve.algorithm.draft.refactor.version2.PrimeGenerator
          .generatePrimes(i);
      print(result);
    }

    System.out.println();
  }

  public static void refactorVersion3() {
    System.out.println("Refactor Version3 2");
    for (int i : testNumbers) {
      result = com.xzinoviou.eratosthenessieve.algorithm.draft.refactor.version3.PrimeGenerator
          .generatePrimes(i);
      print(result);
    }
    System.out.println();
  }

  public static void refactorVersion4() {
    System.out.println("Refactor Version 4");
    for (int i : testNumbers) {
      result = com.xzinoviou.eratosthenessieve.algorithm.draft.refactor.version4.PrimeGenerator
          .generatePrimes(i);
      print(result);
    }
    System.out.println();
  }

  public static void refactorVersion5() {
    System.out.println("Refactor Version 5");
    for (int i : testNumbers) {
      result = com.xzinoviou.eratosthenessieve.algorithm.draft.refactor.version5.PrimeGenerator
          .generatePrimes(i);
      print(result);
    }
    System.out.println();
  }
}
