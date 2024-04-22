package ch.hslu.informatik.ad.sortierungen.A1.E3;

import java.util.Arrays;
import java.util.Random;

public class Util {

    public static int[] genRandomArray(int n) {

        Random random = new Random();
        int[] randomArr = new int[n];

        // Fill the array with random numbers between 1 and 100
        for (int i = 0; i < randomArr.length; i++) {
            randomArr[i] = random.nextInt(100) + 1;
        }

        return randomArr;
    }

    public static int[] genRandomArraySorted(int n) {

        Random random = new Random();
        int[] randomArr = new int[n];

        // Fill the array with random numbers between 1 and 100
        for (int i = 0; i < randomArr.length; i++) {
            randomArr[i] = random.nextInt(100) + 1;
        }
        Arrays.sort(randomArr);

        return randomArr;
    }

    public static int[] genRandomArraySortedBack(int n) {

        Random random = new Random();
        int[] randomArr = new int[n];

        // Fill the array with random numbers between 1 and 100
        for (int i = 0; i < randomArr.length; i++) {
            randomArr[i] = random.nextInt(100) + 1;
        }

        // Sort the array in ascending order
        Arrays.sort(randomArr);

        // Reverse the array to get it in descending order
        for (int i = 0; i < randomArr.length / 2; i++) {
            int temp = randomArr[i];
            randomArr[i] = randomArr[randomArr.length - 1 - i];
            randomArr[randomArr.length - 1 - i] = temp;
        }

        return randomArr;
    }
}
