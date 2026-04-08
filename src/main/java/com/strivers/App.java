package com.strivers;

/* 
import com.strivers.basics.*;
import com.strivers.basics.patterns.*; */

// import com.strivers.basics.collections.*;

// import com.strivers.basics.maths.*;

// import com.strivers.basics.hashing.*;

// import com.strivers.sorting.*;

// import com.strivers.basics.recursion.*;

/* import com.strivers.arrays.easy.*;
import com.strivers.sorting.HoareQuickSort;
import com.strivers.sorting.Quick;
 */

import com.strivers.arrays.medium.*;

public class App {
  public static void main(String[] args) {
    System.out.println("Welcome to strivers list!!\n");

    /*
     * InputOutput.tryInput();
     * ArraysIntroduction.tryArrayIntroduction();
     * IfElseIf.tryIfElse();
     * SwitchCase.trySwitchCase(5);
     * StringsBasics.stringBasics();
     * pattern_2.pattern2();
     * pattern_3.pattern3();
     * pattern_4.pattern4();
     */

    /*
     * DynamicList.arrayList();
     * Stack.learnStack();
     * Queue.tryQueue();
     * HashSetBasics.HashSetBasicsMain();
     * TreeSetBasics.TreeSetMain();
     * LinkedHashSetBasics.LinkedHashSetMain();
     * HashMapBasics.HashMapMain();
     * TreeMapBasics.TreeMapMain();
     * LinkedHashMapBasics.LinkedHashMapMain();
     */

    /*
     * CountAllDigitsOfANumber.countAllDigitsOfANumber();
     * ReverseANumber.reverseANumber();
     * GCDOfTwoNumbers.gCDOfTwoNumbers();
     * CheckIfArmstrong.checkIfArmstrong();
     * FindAllDivisors.findAllDivisors();
     */

    // CountFrequency.countFrequency();

    /*
     * PrintNTimes printNTimes = new PrintNTimes();
     * printNTimes.printNTimes(10);
     */

    /*
     * PrintOneToN printOneToN = new PrintOneToN();
     * printOneToN.printOneToNForward(5);
     * printOneToN.PrintOneToNBacktrack(5);
     * 
     * SumOfFirstNNumbers.sumOfFirstNNumbers(5);
     * Factorial.factorial(5);
     * Fibonacci.fibonacci(8);
     */

    int[] arr = { 32, 2, 8, 71, 1, 6 };
    // Selection.trySeclectionSorting(arr);
    // Bubble.tryBubbleSorting(arr);
    /*
     * Insertion.tryInsertionSorting(arr);
     * 
     * int[] arr1 = { 3, 17, 4, 6, 8, 7 };
     * Merge.tryMergeSorting(arr1, 0, arr1.length - 1);
     * 
     * for (int i : arr1) {
     * System.out.print(i + " ");
     * }
     * System.out.println();
     */
    /*
     * LargestNumber.findLargestNumber(arr);
     * SecondLargestNumber.findSecondLargestNumber(arr);
     * 
     * int[] arr2 = { 1, 1, 1, 1, 2, 2, 3, 4, 5, 6, 6, 7, 7, 7, 7 };
     * RemoveDuplicatesInSortedArray.removeDuplicatesInSortedArray(arr2);
     * 
     * int[] leftRotate = { 1, 2, 3, 4, 5, 6, 7};
     * LeftRotateTheArrayByK.leftRotateTheArrayByK(leftRotate, 2);
     */
    /*
     * Quick.lomuto(arr);
     * HoareQuickSort.tryHoareQuickSorting(arr);
     */
    /*
     * int[] moveZerosArray = { 0, 1, 2, 0, 0, 3, 2, 100 };
     * MoveZeros.moveZeroes(moveZerosArray);
     * 
     * System.out.println("At the index: " + LinearSearch.linearSearch(arr, 71));
     * 
     * int[] a = { 1, 2, 3 };
     * int[] b = { 2, 3, 4, 4, 5 };
     * UnionOfTwoSortedArrays.unionOfTwoSortedArrays(a, b);
     * 
     * int[] ones = { 1, 1, 1, 0, 34, 54, 2342, 32, 1, 1, 0, 1, 1, 1, 1, 1, 93, 22,
     * 1, 1 };
     * MaxConsecutiveOnes.maxConsecutiveOnes(ones);
     * 
     * LongestSubarrayWithSumK.longestSubarrayWithSumK(ones, 5);
     * 
     * SubarraySumEqualsK.subarraySum(ones, 34);
     */

    int[] dutch_flag = { 2, 0, 1, 1, 0, 1, 2, 0, 1 };
    SortZerosOnesAndTwos.sortZerosOnesAndTwos(dutch_flag);

  }
}
