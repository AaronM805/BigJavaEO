package ch14SortingAndSearching.practice_exercises;

import ch10Interfaces.chapter_examples.section1.BankAccount;
import ch10Interfaces.chapter_examples.section1.Country;

import ch14SortingAndSearching.chapter_examples.section1.SelectionSort;

import java.util.Arrays;

import utils.ArrayUtil;
/**
 * Modify the selection sort algorithm to sort an array of objects that implement the Measurable interface from Chapter 10.
 *
 * TIME:
 */
/**
 * Difficulty: Medium
 */
public class E14_5 {
    public static void main(String[] args) {
        BankAccount[] bankAccounts = ArrayUtil.randomBankAccountArray(20);
        System.out.println("Sorting bank accounts");
        System.out.println(Arrays.toString(bankAccounts));
        SelectionSort.sort(bankAccounts);
        System.out.println("\n");
        System.out.println(Arrays.toString(bankAccounts));

        Country[] countries = ArrayUtil.randomCountryArray(20);
        System.out.println("\n\n\n");
        System.out.println("Sorting countries");
        System.out.println(Arrays.toString(countries));
        SelectionSort.sort(countries);
        System.out.println("\n");
        System.out.println(Arrays.toString(countries));
    }
}