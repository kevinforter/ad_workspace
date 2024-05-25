package ch.hslu.informatik.ad.sortierungen.A1.E3;

import java.util.Arrays;
import java.util.Random;

public class Util {

    public static int[] genRandomArray(int n) {

        Random random = new Random();
        int[] randomArr = new int[n];

        // Fill the array with random numbers between 1 and 100
        for (int i = 0; i < randomArr.length; i++) {
            randomArr[i] = random.nextInt(1000000) + 1;
        }

        return randomArr;
    }

    public static int[] genArraySorted(int n) {

        int[] sortedArr = new int[n];

        // Fill the array with random numbers between 1 and 100
        for (int i = 0; i < sortedArr.length; i++) {
            sortedArr[i] = i + 1;
        }
        Arrays.sort(sortedArr);

        return sortedArr;
    }

    public static int[] genArraySortedReverse(int n) {

        int[] reversedArr = new int[n];

        // Fill the array with random numbers between 1 and 100
        for (int i = 0; i < reversedArr.length; i++) {
            reversedArr[i] = i + 1;
        }
        Arrays.sort(reversedArr);

        return reverseArray(reversedArr);
    }

    private static int[] reverseArray(int[] arr) {
        int start = 0; // Index from the beginning
        int end = arr.length - 1; // Index from the end

        while (start < end) {
            // Swap elements at start and end indices
            int temp = arr[start]; // Temporary storage
            arr[start] = arr[end]; // Swap
            arr[end] = temp; // Swap

            // Move towards the center
            start++;
            end--;
        }

        return arr; // Return the reversed array
    }

}
