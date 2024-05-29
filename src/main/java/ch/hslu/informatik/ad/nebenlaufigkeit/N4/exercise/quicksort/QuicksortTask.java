/*
 * Copyright 2024 Hochschule Luzern Informatik.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ch.hslu.informatik.ad.nebenlaufigkeit.N4.exercise.quicksort;

import ch.hslu.informatik.ad.nebenlaufigkeit.N4.exercise.mergesort.InsertionSort;

import java.util.Arrays;
import java.util.concurrent.RecursiveAction;

import static ch.hslu.informatik.ad.nebenlaufigkeit.N4.exercise.quicksort.QuicksortRecursive.partition;
import static ch.hslu.informatik.ad.nebenlaufigkeit.N4.exercise.quicksort.QuicksortRecursive.quicksort;

/**
 * Codevorlage zu RecursiveAction für die Sortierung eines int-Arrays.
 */
@SuppressWarnings("serial")
public final class QuicksortTask extends RecursiveAction {

    private int THRESHOLD = 100_000;
    private final int[] array;
    private final int min;
    private final int max;

    /**
     * Erzeugt einen Array-Sortier Task.
     *
     * @param array Interger-Array.
     */
    public QuicksortTask(int[] array) {
        this(array, 0, array.length - 1);
    }

    private QuicksortTask(final int[] array, final int min, final int max) {
        this.array = array;
        this.min = min;
        this.max = max;
    }

    @Override
    protected void compute() {
        if (max - min < THRESHOLD) {
            // If the sub-array is small enough, sort it directly
            Arrays.sort(array, min, max + 1); // Using min to max+1 to sort the correct segment
        } else {
            // Ensure that min < max to avoid incorrect partition and infinite recursion
            if (min < max) {
                // Partition the array and get the pivot index
                int pivotIndex = partition(array, min, max);

                // Create subtasks for parallel sorting
                QuicksortTask leftTask = new QuicksortTask(array, min, pivotIndex - 1);
                QuicksortTask rightTask = new QuicksortTask(array, pivotIndex + 1, max); // pivotIndex + 1 to exclude pivot

                // Invoke subtasks in parallel
                invokeAll(leftTask, rightTask);
            }
        }
    }

    // Partition method implementation should be included here, for completeness.
    private int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = (low - 1); // Index of smaller element
        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;
                // Swap array[i] and array[j]
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        // Swap array[i + 1] and array[high] (or pivot)
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;
        return i + 1;
    }
}