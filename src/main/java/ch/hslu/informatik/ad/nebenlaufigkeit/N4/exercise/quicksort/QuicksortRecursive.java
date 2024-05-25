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

/**
 * Codevorlage zu RecursiveAction für die Sortierung eines int-Arrays.
 */
public final class QuicksortRecursive {

    /**
     * Öffentliche Methode, die dem Client zur Verfügung gestellt wird,
     * sortiert das gegebene Array mit dem QuickSort Algorithmus in Java.
     *
     * @param array Eingabe-Array.
     */
    public static void quicksort(int[] array) {
        QuicksortRecursive.quicksort(array, 0, array.length - 1);
    }

    /**
     * Rekursive Quicksort-Logik.
     *
     * @param array Eingabe-Array.
     * @param startIdx Startindex des Arrays.
     * @param endIdx Endindex des Arrays.
     */
    public static void quicksort(int[] array, int startIdx, int endIdx) {
    if (startIdx < endIdx) {
        int pivotIndex = partition(array, startIdx, endIdx);
        quicksort(array, startIdx, pivotIndex - 1);
        quicksort(array, pivotIndex + 1, endIdx);
    }
}

    /**
     * Teilt Array von Pivot, linke Seite enthält Elemente kleiner als Pivot
     * während die rechte Seite Elemente enthält, die größer als Pivot sind.
     *
     * @param array unterteilendes Array Array.
     * @param left untere Grenze des Arrays.
     * @param right obere Grenze des Arrays.
     * @return  des Partitionsindexes.
     */
    public static int partition(int[] array, int left, int right) {
        int pivot = array[right];
        int i = (left - 1); // index des kleineren Elementes

        for (int j = left; j < right; j++) {
            // Wenn aktuelles Element kleiner gleich dem Pivot ist dann wechsle
            if (array[j] <= pivot) {
                i++;

                // array[i] und array[j] wechseln
                exchange(array, i, j);
            }
        }

        // array[i+1] und array[right] (oder pivot) wechseln
        exchange(array, i + 1, right);

        return i + 1;
    }

    // Auslagerung der exchange Funktion
    private static void exchange(final int[] array, final int i, final int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
