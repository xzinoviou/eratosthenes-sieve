package com.xzinoviou.eratosthenessieve.algorithm;

import com.xzinoviou.eratosthenessieve.algorithm.draft.initial.GeneratePrimes;
import com.xzinoviou.eratosthenessieve.algorithm.draft.refactor.version4.PrimeGenerator;
import java.util.Arrays;

public class TestGeneratePrimes {

  private static int[] testNumbers = new int[] {0, 2, 3, 100};
  private static int[] result = null;

  public static void main(String[] args) {
    initialDraft();
    refactor1();
    refactor2();
    refactor3();

  }

  public static void print(int[] primes) {
    System.out.println("n = " + primes.length + " : " + Arrays.toString(primes));


  }

  public static void initialDraft() {
    System.out.println("Initial Draft");
    for (int i : testNumbers) {
      result = GeneratePrimes.generatePrimes(i);
      print(result);
    }
    System.out.println();
  }

  public static void refactor1() {
    System.out.println("Refactor 1");
    for (int i : testNumbers) {
      result = com.xzinoviou.eratosthenessieve.algorithm.draft.refactor.version2.PrimeGenerator
          .generatePrimes(i);
      print(result);
    }

    System.out.println();
  }

  public static void refactor2() {
    System.out.println("Refactor 2");
    for (int i : testNumbers) {
      result = com.xzinoviou.eratosthenessieve.algorithm.draft.refactor.version3.PrimeGenerator
          .generatePrimes(i);
      print(result);
    }
    System.out.println();
  }

  public static void refactor3() {
    System.out.println("Refactor 3");
    for (int i : testNumbers) {
      result = PrimeGenerator.generatePrimes(i);
      print(result);
    }
    System.out.println();
  }
}
