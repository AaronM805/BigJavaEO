package utils;

import java.util.Random;

import ch10_interfaces.chapter_examples.section1.BankAccount;
import ch10_interfaces.chapter_examples.section1.Country;
import ch10_interfaces.chapter_examples.section1.Measurable;

import ch14_sorting_and_searching.practice_exercises.pojo.Coin;

/**
   This class contains utility methods for array manipulation.
*/  
public class ArrayUtil
{ 
   private static Random generator = new Random();

   /**
    * Creates an array filled with random BankAccount objects.
    *
    * @param length the length of the array
    *
    * @return an array filled with BankAccounts with a balance between 0 and 999
    */
   public static BankAccount[] randomBankAccountArray(int length) {
    BankAccount[] a = new BankAccount[length];
    for(int i = 0; i < a.length; i++) {
      a[i] = new BankAccount(generator.nextDouble() * 1000);
    }
    return a;
   }
   
   /**
      Creates an array filled with random Coin objects.
      @param length the length of the array
      @param n the number of possible random values
      @return an array filled with length numbers between 0 and 99
   */
  public static Coin[] randomCoinArray(int length, int n)
  {  
    Coin[] a = new Coin[length];
    for (int i = 0; i < a.length; i++) {
        a[i] = new Coin(generator.nextDouble() * 100, "dummy");
    }
    return a;
  }

  /**
    * Creates an array filled with random Country objects.
    *
    * @param length the length of the array
    *
    * @return an array filled with Country with an area between 0 and 99999
    */
   public static Country[] randomCountryArray(int length) {
    Country[] a = new Country[length];
    for(int i = 0; i < a.length; i++) {
      a[i] = new Country("Dummy Country", generator.nextDouble() * 100000);
    }
    return a;
   }

   /**
      Creates an array filled with random values.
      @param length the length of the array
      @param n the number of possible random values
      @return an array filled with length numbers between
      0 and n - 1
   */
   public static int[] randomIntArray(int length, int n)
   {  
      int[] a = new int[length];      
      for (int i = 0; i < a.length; i++)
      {
         a[i] = generator.nextInt(n);
      }
      
      return a;
   }

   /**
      Creates an array filled with random values.
      @param length the length of the array
      @param n the number of possible random values
      @return an array filled with length numbers between
      0 and n - 1
   */
  public static long[] randomLongArray(int length, long n)
  {  
     long[] a = new long[length];
     for (int i = 0; i < a.length; i++)
     {
        a[i] = generator.nextLong() * n;
     }
     return a;
  }

   /**
      Swaps two entries of an array.
      @param a the array
      @param i the first position to swap
      @param j the second position to swap
   */
   public static void swap(int[] a, int i, int j)
   {
      int temp = a[i];
      a[i] = a[j];
      a[j] = temp;
   }

   /**
      Swaps two entries of an array.
      @param a the array
      @param i the first position to swap
      @param j the second position to swap
   */
  public static void swap(Coin[] a, int i, int j)
  {
     Coin temp = a[i];
     a[i] = a[j];
     a[j] = temp;
  }

  public static void swap(Measurable[] data, int i, int j) {
    Measurable tmp = data[i];
    data[i] = data[j];
    data[j] = tmp;
  }
}