/* Created by IntelliJ IDEA.

Author: Prajjwal Pachauri(cypher)
Date: 23-02-2022
Time: 18:37
File: SampleProblem.java */

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class SampleProblem {
    /**
     * Given an array of integers, return the sum of the array
     *
     * @param arr an array of integers
     * @return The sum of the array.
     */
    public static int sumOfArray(int[] arr) {
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        return sum;
    }
    /**
     * Given an array of integers, find the maximum number of candies that can be given to each kid
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int testCases = scanner.nextInt();
        while (testCases-- > 0) {
            int numberOfBags = scanner.nextInt();
            int numberOfKids = scanner.nextInt();

            int[] candies = new int[numberOfBags];
            for (int i = 0; i < candies.length; i++) {
                candies[i] = scanner.nextInt();
            }

            int sumOfAllCandies = sumOfArray(candies);
            int maximumNumberOfCandiesForEachKid = (sumOfAllCandies / numberOfKids);
            int remainingCandies = sumOfAllCandies - (maximumNumberOfCandiesForEachKid * numberOfKids);

            System.out.println(remainingCandies);
        }
    }
}