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
package ch.hslu.informatik.ad.nebenlaufigkeit.N4.exercise.mergesort;

import ch.hslu.informatik.ad.nebenlaufigkeit.N4.n41.array.init.RandomInitTask;

import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

/**
 * Performance Vergleich der Mergesort-Implementation.
 */
public final class DemoMergesort {

    private static final Logger LOG = LoggerFactory.getLogger(DemoMergesort.class);

    /**
     * Privater Konstruktor.
     */
    private DemoMergesort() {
    }

    /**
     * Main-Demo.
     *
     * @param args not used.
     */
    public static void main(final String[] args) {

        StringBuilder table = new StringBuilder();
        table.append("| Methode | Threshold | Time (sec) |\n");
        table.append("|---------|-----------|------------|\n");

        for (int i = 0; i < 1; i++) {

            final int size = 300_000_000;
            final int[] arrayOriginal = new int[size];
            try (final ForkJoinPool pool = new ForkJoinPool()) {
                RandomInitTask initTask = new RandomInitTask(arrayOriginal, 100);
                pool.invoke(initTask);

                int minThreshold = 30_000_000;
                int maxThreshold = 30_000_000;
                int step = 20;

                for (int threshold = minThreshold; threshold <= maxThreshold; threshold += step) {

                    int[] array = Arrays.copyOf(arrayOriginal, size);
                    final MergesortTask sortTask = new MergesortTask(array, threshold);

                    // Mergesort mit Threads
                    long start = System.currentTimeMillis();
                    pool.invoke(sortTask);
                    long end = System.currentTimeMillis();
                    final ch.hslu.ad.n41.array.sort.check.SortCheckTask check = new ch.hslu.ad.n41.array.sort.check.SortCheckTask(array);
                    boolean ok = pool.invoke(check);
                    LOG.info("Sort Check OK? : {}", ok);

                    double time = (end - start) / 1E3;
                    LOG.info("Conc. Mergesort : {} sec.", time);
                    table.append("| Conc. Mergesort ").append(" | ").append(threshold).append(" | ").append(time).append(" |\n");

                    array = Arrays.copyOf(arrayOriginal, size);

                    // Rekursiver Mergesort
                    start = System.currentTimeMillis();
                    MergesortRecursive.mergeSort(array);
                    end = System.currentTimeMillis();

                    time = (end - start) / 1E3;
                    LOG.info("MergesortRec.   : {} sec.", time);
                    table.append("| MergesortRec. ").append(" | ").append(threshold).append(" | ").append(time).append(" |\n");

                    array = Arrays.copyOf(arrayOriginal, size);

                    // Parallelsort → basierend auf Mergesort
                    start = System.currentTimeMillis();
                    Arrays.parallelSort(array);
                    end = System.currentTimeMillis();

                    time = (end - start) / 1E3;
                    LOG.info("ParallelSort.   : {} sec.", time);
                    table.append("| ParallelSort. ").append(" | ").append(threshold).append(" | ").append(time).append(" |\n");

                }


            } finally {
                // Executor shutdown
            }
        }

        System.out.println(table.toString());
    }
}
